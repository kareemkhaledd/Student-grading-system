/*
* @Author: Mohamed Abdel Hamid
* */
package Project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class ParseFileTest {

    /* Test Throwing Exceptions */
    @Test
    public void getSubject_notCompletedAttributesForSubject() throws InvalidDataException {
        String []in = {"Testing,CSE321",
                "Mohamed,2001087,5,5,5,5"
        };
        InvalidDataException exception = assertThrows(InvalidDataException.class, () ->
                ParseFile.getSubject(in));

        assertEquals("Invalid Subject Attributes", exception.getMessage());
    }

    @Test
    public void getSubject_noSubjectOrStudentsInputFile() throws InvalidDataException {
        String []in = {"Mohamed,2001087,5,5,5,5"
        };
        InvalidDataException exception = assertThrows(InvalidDataException.class, () ->
                ParseFile.getSubject(in));

        assertEquals("Invalid input file: It has no students or has no subject", exception.getMessage());
    }

    @Test
    public void getSubject_invalidName() throws InvalidDataException {
        String []in = {"Test%%ing,CSE321,100",
                "Mohamed,2001087,5,5,5,5"
        };
        InvalidDataException exception = assertThrows(InvalidDataException.class, () ->
                ParseFile.getSubject(in));

        assertEquals("Test%%ing is Invalid", exception.getMessage());
    }

    @Test
    public void getSubject_invalidCode() throws InvalidDataException {
        String []in = {"Testing,CSE&321,100",
                "Mohamed,2001087,5,5,5,5"
        };
        InvalidDataException exception = assertThrows(InvalidDataException.class, () ->
                ParseFile.getSubject(in));

        assertEquals("CSE&321 is Invalid", exception.getMessage());
    }
    @Test
    public void getSubject_invalidMaxMark() throws InvalidDataException {
        String []in = {"Testing,CSE321,-2",
                "Mohamed,2001087,5,5,5,5"
        };
        InvalidDataException exception = assertThrows(InvalidDataException.class, () ->
                ParseFile.getSubject(in));

        assertEquals("-2 is Invalid", exception.getMessage());
    }
    @Test
    public void getSubject_invalidNameAndCode() throws InvalidDataException {
        String []in = {"Test%%ing,CSE3&&21,100",
                "Mohamed,2001087,5,5,5,5"
        };
        InvalidDataException exception = assertThrows(InvalidDataException.class, () ->
                ParseFile.getSubject(in));

        assertEquals("Test%%ing is Invalid", exception.getMessage());
    }
    @Test
    public void getSubject_invalidCodeAndMax() throws InvalidDataException {
        String []in = {"Testing,CS&&E321,-5",
                "Mohamed,2001087,5,5,5,5"
        };
        InvalidDataException exception = assertThrows(InvalidDataException.class, () ->
                ParseFile.getSubject(in));

        assertEquals("CS&&E321 is Invalid", exception.getMessage());
    }

    /* Test Creating Objects */
    @Test
    public void getSubject_storingWhenValidData() throws InvalidDataException {
        String []in = {"Testing,CSE321,100",
                "Mohamed,2001087,5,5,5,5"
        };
        Subject sub = ParseFile.getSubject(in);


        Subject expectedSubjectData = new Subject("Testing","CSE321",100);

        assertEquals(expectedSubjectData,sub);

    }

    @Test
    public void getSubject_storingWhenInvalidData() throws InvalidDataException {
        String []in = {"Tes&&ting,CSE321,100",
                "Mohamed,2001087,5,5,5,5"
        };
        Subject sub =null;
        try {
            sub =  ParseFile.getSubject(in);
        } catch (Exception e) { /* do nothing */ }


        assertNull(sub);
    }

    /* Test Fill Students */
    @Test
    public void fillStudents_invalidName() throws InvalidDataException {
        String []in = {"Testing,CSE321,100",
                "Moham&&ed,20001087,5,5,5,5"
        };
        Subject sub = new Subject("Testing","CSE321",100);

        InvalidDataException exception = assertThrows(InvalidDataException.class, () ->
                ParseFile.FillStudent(in, sub));

        assertEquals("Moham&&ed is Invalid", exception.getMessage());

    }

    @Test
    public void fillStudent_invalidCode() throws InvalidDataException {
        String []in = {"Testing,CSE321,100",
                "Mohamed,2001087,5,5,5,5"
        };
        Subject sub = new Subject("Testing","CSE321",100);

        InvalidDataException exception = assertThrows(InvalidDataException.class, () ->
                ParseFile.FillStudent(in, sub));

        assertEquals("2001087 is Invalid", exception.getMessage());
    }
    @Test
    public void fillStudents_invalidDegrees() throws InvalidDataException {
        String []in = {"Testing,CSE321,100",
                "Mohamed,20001087,-5,5,5,5"
        };
        Subject sub = new Subject("Testing","CSE321",100);

        InvalidDataException exception = assertThrows(InvalidDataException.class, () ->
                ParseFile.FillStudent(in, sub));

        assertEquals("-5 is Invalid", exception.getMessage());
    }
    @Test
    public void fillStudents_invalidNameAndCode() throws InvalidDataException {
        String []in = {"Testing,CSE321,100",
                "Mohame&d,200&01087,-5,5,5,5"
        };
        Subject sub = new Subject("Testing","CSE321",100);

        InvalidDataException exception = assertThrows(InvalidDataException.class, () ->
                ParseFile.FillStudent(in, sub));

        assertEquals("Mohame&d is Invalid", exception.getMessage());

    }
    @Test
    public void fillStudents_invalidCodeAndDegree() throws InvalidDataException {
        String []in = {"Testing,CSE321,100",
                "Mohamed,2001087,-5,5,5,5"
        };
        Subject sub = new Subject("Testing","CSE321",100);

        InvalidDataException exception = assertThrows(InvalidDataException.class, () ->
                ParseFile.FillStudent(in, sub));

        assertEquals("2001087 is Invalid", exception.getMessage());
    }

    /* Test Creating Objects */
    @Test
    public void fillStudents_storingWhenValidData() throws InvalidDataException {
        String []in = {"Testing,CSE321,100",
                "Mohamed,20001087,5,5,5,5"
        };
        Subject sub = new Subject(in.length-1);
        sub.Name = "Testing";
        sub.Code = "CSE321";
        sub.FullMark = 100;
        ParseFile.FillStudent(in,sub);


        Subject expectedSubjectData = new Subject("Testing","CSE321",100);
        Student expectedStudent = new Student("Mohamed", "20001087", 5, 5, 5, 5);

        assertEquals(expectedStudent,sub.students[0]);

    }

    @Test
    public void fillStudent_storingWhenInvalidData() throws InvalidDataException {
        String []in = {"Testing,CSE321,100",
                "Moha&&med,2001087,5,5,5,5"
        };
        Subject sub = new Subject(in.length-1);
        sub.Name = "Testing";
        sub.Code = "CSE321";
        sub.FullMark = 100;

        try {
            ParseFile.FillStudent(in,sub);
        } catch (Exception e) { /* do nothing */ }
        Student expectedStudent = new Student();

        assertEquals(expectedStudent,sub.students[0]);
    }



}