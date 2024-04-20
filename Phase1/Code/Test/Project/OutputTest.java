package Project;

import org.junit.Test;
import static org.junit.Assert.*;


public class OutputTest {
    public OutputTest() {
    }


    /**
     * Test of make_file method, of class Output.
     */
    @Test
    public void testMake_file() {
        System.out.println("make_file");
        Subject sub1=new Subject(3);
        sub1.Name="ENGLISH";
        sub1.FullMark=100;
        sub1.students[0].Name="Sara";
        sub1.students[1].Name="Mariam";
        sub1.students[2].Name="Nada";
        sub1.students[0].GPA=new GPAResult(3.7,"A-");
        sub1.students[1].GPA=new GPAResult(3,"B+");
        sub1.students[2].GPA=new GPAResult(4,"A");
        sub1.students[0].Code="121";
        sub1.students[1].Code="122";
        sub1.students[2].Code="123";
        String expected="Text file created successfully: ";
        String actual=Output.make_file(sub1);
        assertEquals(expected,actual);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testEmpty_file()
    {
        Subject sub=null;
        String expected="no file is created";
        String actual=Output.make_file(sub);
        assertEquals(expected,actual);
    }
}