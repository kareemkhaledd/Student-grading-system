package Project;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataCheckTest {
    //Method under test : CheckStudentNumber
    //Test scenario: Valid student number
    @Test
    public void testValidNumberOf8Numbers() {
        String StudentNumber = "20010911";
        assertTrue(DataCheck.CheckStudentNumber(StudentNumber));
    }
    @Test
    public  void testValidNumberOf7NumbersAndCharacter_1() {
        String StudentNumber = "2001091x";
        assertTrue(DataCheck.CheckStudentNumber(StudentNumber));
    }
    @Test
    public void testValidNumberOf7NumbersAndCharacter_2() {
        String StudentNumber = "2001091X";
        assertTrue(DataCheck.CheckStudentNumber(StudentNumber));
    }
    //Method under test : CheckStudentNumber
    //Test scenario: Invalid student number
    @Test
    public void testInvalidNumberLength() {
        String StudentNumber = "2001091";
        assertFalse(DataCheck.CheckStudentNumber(StudentNumber));
    }
    @Test
    public void testInvalidNumberFormat_1() {
        String StudentNumber = "2x010911";
        assertFalse(DataCheck.CheckStudentNumber(StudentNumber));
    }
    @Test
    public void testInvalidNumberFormat_2() {
        String StudentNumber = "20 10911";
        assertFalse(DataCheck.CheckStudentNumber(StudentNumber));
    }
    @Test
    public void testInvalidNumberFormat_3() {
        String StudentNumber = "200#0911";
        assertFalse(DataCheck.CheckStudentNumber(StudentNumber));
    }
    @Test
    public void testInvalidNumberFormat_4() {
        String StudentNumber = " 0010911";
        assertFalse(DataCheck.CheckStudentNumber(StudentNumber));
    }
    @Test
    public void testInvalidNumberFormat_5() {
        String StudentNumber = "2001091 ";
        assertFalse(DataCheck.CheckStudentNumber(StudentNumber));
    }
    @Test
    public void testInvalidNumberFormat_6() {
        String StudentNumber = "2001091#";
        assertFalse(DataCheck.CheckStudentNumber(StudentNumber));
    }
    //Method under test : CheckActivitiesMark
    //Test scenario: Valid Activities Mark
    @Test
    public void testValidActivitiesMark_1() {
        int mark=10;
        int fullMark=100;
        assertTrue(DataCheck.CheckActivitiesMark(mark, fullMark));
    }
    @Test
    public void testValidActivitiesMark_2() {
        int mark=0;
        int fullMark=100;
        assertTrue(DataCheck.CheckActivitiesMark(mark, fullMark));
    }
    @Test
    public void testValidActivitiesMark_3() {
        int mark=12;
        int fullMark=120;
        assertTrue(DataCheck.CheckActivitiesMark(mark, fullMark));
    }
    @Test
    public void testValidActivitiesMark_4() {
        int mark=5;
        int fullMark=100;
        assertTrue(DataCheck.CheckActivitiesMark(mark, fullMark));
    }
    //Method under test : CheckActivitiesMark
    //Test scenario: Invalid Activities Mark
    @Test
    public void testInValidActivitiesMark_1() {
        int mark=-1;
        int fullMark=100;
        assertFalse(DataCheck.CheckActivitiesMark(mark, fullMark));
    }
    @Test
    public void testInValidActivitiesMark_2() {
        int mark=11;
        int fullMark=100;
        assertFalse(DataCheck.CheckActivitiesMark(mark, fullMark));
    }
    @Test
    public void testInValidActivitiesMark_3() {
        int mark=13;
        int fullMark=120;
        assertFalse(DataCheck.CheckActivitiesMark(mark, fullMark));
    }
    //Method under test : CheckOralPracticalMark
    //Test scenario: Valid Activities Mark
    @Test
    public void testValidOralPracticalMark_1() {
        int mark=10;
        int fullMark=100;
        assertTrue(DataCheck.CheckOralPracticalMark(mark, fullMark));
    }
    @Test
    public void testValidOralPracticalMark_2() {
        int mark=0;
        int fullMark=100;
        assertTrue(DataCheck.CheckOralPracticalMark(mark, fullMark));
    }
    @Test
    public void testValidOralPracticalMark_3() {
        int mark=12;
        int fullMark=120;
        assertTrue(DataCheck.CheckOralPracticalMark(mark, fullMark));
    }
    @Test
    public void testValidOralPracticalMark_4() {
        int mark=5;
        int fullMark=100;
        assertTrue(DataCheck.CheckOralPracticalMark(mark, fullMark));
    }
    //Method under test : CheckOralPracticalMark
    //Test scenario: Invalid Activities Mark
    @Test
    public void testInValidOralPracticalMark_1() {
        int mark=-1;
        int fullMark=100;
        assertFalse(DataCheck.CheckOralPracticalMark(mark, fullMark));
    }
    @Test
    public void testInValidOralPracticalMark_2() {
        int mark=11;
        int fullMark=100;
        assertFalse(DataCheck.CheckOralPracticalMark(mark, fullMark));
    }
    @Test
    public void testInValidOralPracticalMark_3() {
        int mark=13;
        int fullMark=120;
        assertFalse(DataCheck.CheckOralPracticalMark(mark, fullMark));
    }
    //Method under test : CheckMidtermExamMark
    //Test scenario: Valid Midterm Exam Mark
    @Test
    public void testValidMidtermExamMark_1() {
        int mark=20;
        int fullMark=100;
        assertTrue(DataCheck.CheckMidtermExamMark(mark, fullMark));
    }
    @Test
    public void testValidMidtermExamMark_2() {
        int mark=0;
        int fullMark=100;
        assertTrue(DataCheck.CheckMidtermExamMark(mark, fullMark));
    }
    @Test
    public void testValidMidtermExamMark_3() {
        int mark=24;
        int fullMark=120;
        assertTrue(DataCheck.CheckMidtermExamMark(mark, fullMark));
    }
    @Test
    public void testValidMidtermExamMark_4() {
        int mark=10;
        int fullMark=100;
        assertTrue(DataCheck.CheckMidtermExamMark(mark, fullMark));
    }
    //Method under test : CheckMidtermExamMark
    //Test scenario: Invalid Midterm Exam Mark
    @Test
    public void testInValidMidtermExamMark_1() {
        int mark=-1;
        int fullMark=100;
        assertFalse(DataCheck.CheckMidtermExamMark(mark, fullMark));
    }
    @Test
    public void testInValidMidtermExamMark_2() {
        int mark=21;
        int fullMark=100;
        assertFalse(DataCheck.CheckMidtermExamMark(mark, fullMark));
    }
    @Test
    public void testInValidMidtermExamMark_3() {
        int mark=25;
        int fullMark=120;
        assertFalse(DataCheck.CheckMidtermExamMark(mark, fullMark));
    }
    //Method under test : CheckFinalExamMark
    //Test scenario: Valid Final Exam Mark
    @Test
    public void testValidFinalExamMark_1() {
        int mark=60;
        int fullMark=100;
        assertTrue(DataCheck.CheckFinalExamMark(mark, fullMark));
    }
    @Test
    public void testValidFinalExamMark_2() {
        int mark=0;
        int fullMark=100;
        assertTrue(DataCheck.CheckFinalExamMark(mark, fullMark));
    }
    @Test
    public void testValidFinalExamMark_3() {
        int mark=72;
        int fullMark=120;
        assertTrue(DataCheck.CheckFinalExamMark(mark, fullMark));
    }
    @Test
    public void testValidFinalExamMark_4() {
        int mark=40;
        int fullMark=100;
        assertTrue(DataCheck.CheckFinalExamMark(mark, fullMark));
    }
    //Method under test : CheckFinalExamMark
    //Test scenario: Invalid Final Exam Mark
    @Test
    public void testInValidFinalExamMark_1() {
        int mark=-1;
        int fullMark=100;
        assertFalse(DataCheck.CheckFinalExamMark(mark, fullMark));
    }
    @Test
    public void testInValidFinalExamMark_2() {
        int mark=61;
        int fullMark=100;
        assertFalse(DataCheck.CheckFinalExamMark(mark, fullMark));
    }
    @Test
    public void testInValidFinalExamMark_3() {
        int mark=73;
        int fullMark=120;
        assertFalse(DataCheck.CheckFinalExamMark(mark, fullMark));
    }

}