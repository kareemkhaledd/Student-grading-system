package Project;

import org.junit.Test;

import static org.junit.Assert.*;

public class GPATest {
    //valid scenarios
    @Test
    public void testCalculateGPAAndGrade_APlus() {
        GPAResult result = GPA.calculateGPAAndGrade(10, 10, 19, 58); // Total is 97
        assertEquals("A+", result.getGrade());
        assertEquals(4.0, result.getGpa(), 0.01);
    }

    @Test
    public void testCalculateGPAAndGrade_A() {
        GPAResult result = GPA.calculateGPAAndGrade(9, 10, 19, 55); // Total is 93
        assertEquals("A", result.getGrade());
        assertEquals(4.0, result.getGpa(), 0.01);
    }

    @Test
    public void testCalculateGPAAndGrade_AMinus() {
        GPAResult result = GPA.calculateGPAAndGrade(8, 10, 20, 51); // Total is 89
        assertEquals("A-", result.getGrade());
        assertEquals(3.7, result.getGpa(), 0.01);
    }

    @Test
    public void testCalculateGPAAndGrade_BPlus() {
        GPAResult result = GPA.calculateGPAAndGrade(9, 9, 19, 47); // Total is 84
        assertEquals("B+", result.getGrade());
        assertEquals(3.3, result.getGpa(), 0.01);
    }

    @Test
    public void testCalculateGPAAndGrade_B() {
        GPAResult result = GPA.calculateGPAAndGrade(10, 10, 20, 40); // Total is 80
        assertEquals("B", result.getGrade());
        assertEquals(3.0, result.getGpa(), 0.01);
    }

    @Test
    public void testCalculateGPAAndGrade_BMinus() {
        GPAResult result = GPA.calculateGPAAndGrade(10, 10, 20, 36); // Total is 76
        assertEquals("B-", result.getGrade());
        assertEquals(2.7, result.getGpa(), 0.01);
    }

    @Test
    public void testCalculateGPAAndGrade_CPlus() {
        GPAResult result = GPA.calculateGPAAndGrade(10, 10, 20, 33); // Total is 73
        assertEquals("C+", result.getGrade());
        assertEquals(2.3, result.getGpa(), 0.01);
    }

    @Test
    public void testCalculateGPAAndGrade_C() {
        GPAResult result = GPA.calculateGPAAndGrade(10, 10, 20, 30); // Total is 70
        assertEquals("C", result.getGrade());
        assertEquals(2.0, result.getGpa(), 0.01);
    }

    @Test
    public void testCalculateGPAAndGrade_CMinus() {
        GPAResult result = GPA.calculateGPAAndGrade(10, 10, 20, 27); // Total is 67
        assertEquals("C-", result.getGrade());
        assertEquals(1.7, result.getGpa(), 0.01);
    }

    @Test
    public void testCalculateGPAAndGrade_DPlus() {
        GPAResult result = GPA.calculateGPAAndGrade(10, 10, 20, 24); // Total is 64
        assertEquals("D+", result.getGrade());
        assertEquals(1.3, result.getGpa(), 0.01);
    }

    @Test
    public void testCalculateGPAAndGrade_D() {
        GPAResult result = GPA.calculateGPAAndGrade(10, 10, 20, 20); // Total is 60
        assertEquals("D", result.getGrade());
        assertEquals(1.0, result.getGpa(), 0.01);
    }

    @Test
    public void testCalculateGPAAndGrade_F() {
        GPAResult result = GPA.calculateGPAAndGrade(9, 5, 14, 30); // Total is 58
        assertEquals("F", result.getGrade());
        assertEquals(0.0, result.getGpa(), 0.01);
    }



    //checking invalid scenarios "<0" and ">100"
    @Test
    public void testCalculateGPAAndGrade_InvalidHighTotalMark() {
        try {
            GPAResult result = GPA.calculateGPAAndGrade(10, 10, 20, 110); // Total is more than 100
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid total mark", e.getMessage());
        }
    }

    @Test
    public void testCalculateGPAAndGrade_InvalidLowTotalMark() {
        try {
            GPAResult result = GPA.calculateGPAAndGrade(10, 10, 20, -110); // Total is less than 0
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid total mark", e.getMessage());
        }
    }
}