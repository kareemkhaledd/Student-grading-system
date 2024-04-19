package Project;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubjectValidationTest {
    /**
     * Test of checkName method, of class SubjectValidation.
     */
    @Test
    public void testValidName_1() {

        String Name = "Anas Hamed";

        assertTrue(SubjectValidation.checkName(Name));

    }

    @Test
    public void testValidName_2() {

        String Name = "Math";

        assertTrue(SubjectValidation.checkName(Name));

    }

    @Test
    public void testInvalidNameStartWithSpace() {

        String Name = " Testing";

        assertFalse(SubjectValidation.checkName(Name));

    }

    @Test
    public void testInvalidNameEmpty() {

        String Name = "";

        assertFalse(SubjectValidation.checkName(Name));

    }

    @Test
    public void testInvalidNameContainDigitOrSpecialChar_1() {

        String Name = "Control2";

        assertFalse(SubjectValidation.checkName(Name));

    }

    @Test
    public void testInvalidNameContainDigitOrSpecialChar_2() {

        String Name = "M@th2";

        assertFalse(SubjectValidation.checkName(Name));

    }


    /**
     * Test of checkSubjectValidationCode method, of class SubjectValidation.
     */

    @Test
    public void testValidSubjectValidationCode_1(){

        String code ="CSE321s";
        assertTrue(SubjectValidation.checkSubjectCode(code));

    }

    @Test
    public void testValidSubjectValidationCode_2(){

        String code ="CSE345";
        assertTrue(SubjectValidation.checkSubjectCode(code));

    }

    @Test
    public void testInvalidSubjectValidationCodeLenght_1(){

        String code ="CSE31";
        assertFalse(SubjectValidation.checkSubjectCode(code));

    }

    @Test
    public void testInvalidSubjectValidationCodeLenght_2(){

        String code ="CSE3131s";
        assertFalse(SubjectValidation.checkSubjectCode(code));

    }

    @Test
    public void testInvalidSubjectValidationCodeAtFirst3Digits_1(){

        String code ="%SE321";
        assertFalse(SubjectValidation.checkSubjectCode(code));

    }

    @Test
    public void testInvalidSubjectValidationCodeAtFirst3Digits_2(){

        String code ="S3E321";
        assertFalse(SubjectValidation.checkSubjectCode(code));

    }

    @Test
    public void testInvalidSubjectValidationCodeAtFirst3Digits_3(){

        String code ="CS 321s";
        assertFalse(SubjectValidation.checkSubjectCode(code));

    }



    @Test
    public void testInvalidSubjectValidationCodeAtSecond3Digits_1(){

        String code ="CSE3 1";
        assertFalse(SubjectValidation.checkSubjectCode(code));

    }



    @Test
    public void testInvalidSubjectValidationCodeAtSecond3Digits_2(){

        String code ="CSE3#1";
        assertFalse(SubjectValidation.checkSubjectCode(code));

    }

    @Test
    public void testInvalidSubjectValidationCodeAtSecond3Digits_3(){

        String code ="CSE3a1";
        assertFalse(SubjectValidation.checkSubjectCode(code));

    }

    @Test
    public void testInvalidSubjectValidationCodeAt7thChar(){

        String code ="CSE331h";
        assertFalse(SubjectValidation.checkSubjectCode(code));

    }

    /**
     * Test of checkFullMark method, of class SubjectValidation.
     */

    @Test
    public void testValidFullMark(){

        int FullMark=100;
        assertTrue(SubjectValidation.checkFullMark(FullMark));

    }

    @Test
    public void testInvalidFullMark_1(){

        int FullMark=-100;
        assertFalse(SubjectValidation.checkFullMark(FullMark));

    }

    @Test
    public void testInvalidFullMark_2(){

        int FullMark=54;
        assertFalse(SubjectValidation.checkFullMark(FullMark));

    }
}