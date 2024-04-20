package Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author: Ahmed Helmy
 */
public class OpenFileClass {
    private String filePath;

    public OpenFileClass(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }






    public static String[] openFile(String filePath) {
        // Check file extension
        if (!filePath.toLowerCase().endsWith(".txt")) {
            System.err.println("Error: File extension is not .txt");
            return null;
        }

        // Declare the array
        String[] studentDetailsList = null;

        try {
            // Read input file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Get the number of lines in the file
            long lineCount = reader.lines().count();
            reader.close();

            // Initialize the array based on the number of lines
            studentDetailsList = new String[(int) lineCount];

            // Read input file again to fill the array
            reader = new BufferedReader(new FileReader(filePath));
            int i = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                // Remove white spaces
                line = line.replaceAll("\\s+", "");

                // Check for empty line after removing white spaces
                if (line.isEmpty()) {
                    System.err.println("Error: File contains empty line.");
                    continue; // Move to the next iteration
                }

                studentDetailsList[i] = line;
                i++;
            }

            // Close resources
            reader.close();
            System.out.println("The application input is a file. The application reads each line in this file as one string \n" +
                    "where each of its fields are separated by comma “,”");

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return studentDetailsList;
    }

}


