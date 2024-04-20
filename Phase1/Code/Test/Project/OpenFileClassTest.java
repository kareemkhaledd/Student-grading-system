package Project;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class OpenFileClassTest {
    public void test_openFileClass() {
    }

    @Test
    public void testOpenFileWithValidFile() {
        String filePath = "E:/Senior1 2nd semester/Software testing/IntegratedProject/StudentsGrades/input_data.txt";
        String[] result = OpenFileClass.openFile(filePath);
        assertNotNull(result);
        assertEquals(11, result.length); // Assuming there are 11lines in the file

    }

    @Test
    public void testOpenFileWithInvalidExtension() {
        String filePath = "E:/Senior1 2nd semester/Software testing/IntegratedProject/StudentsGrades/input_data.csv";
        String[] result = OpenFileClass.openFile(filePath);
        assertNull(result);

    }

    @Test
    public void testOpenFileWithEmptyLines() {
        String filePath = "E:/Senior1 2nd semester/Software testing/IntegratedProject/StudentsGrades/empty_file.txt";
        String[] expectedResult = {};

        String[] result = OpenFileClass.openFile(filePath);

        // Assert that the result matches the expected result
        assertArrayEquals(expectedResult, result);

    }

    @Test
    public void testOpenFileWithNonexistentFile() {
        String filePath = "nonexistent_file.txt";
        String[] result = OpenFileClass.openFile(filePath);
        assertNull(result);
        //assertEquals(0, result.length); // Assert that the returned list is empty

    }
}