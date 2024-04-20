/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Project.Main.java to edit this template
 */
package Project;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author DELL
 */
public class Output {

private String subject_name;
private int full_mark;
private String[] names;
private String[] numbers;
private int[] GPAs;
private char[] grades;

    public Output(String subject_name, int full_mark, String[] names,String[] numbers, int[] GPAs, char[] grades) {
        this.subject_name = subject_name;
        this.full_mark = full_mark;
        this.names = names;
        this.numbers=numbers;
        this.GPAs = GPAs;
        this.grades = grades;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public static String make_file(Subject sub)
    {
        String filename = "Grades.txt"; // Name of the text file to create
        if(sub==null)
        {
            return "no file is created";
        }

        try {
            FileWriter fileWriter = new FileWriter(filename);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Writing content to the file
            printWriter.println("Subject Name: "+ sub.Name+ "       Max Mark:"+sub.FullMark);
            printWriter.println("Student name    Student number      GPA      Grade");
            for(int i =0;i<sub.students.length;i++)
            {
                printWriter.println(sub.students[i].Name +"\t\t\t"+sub.students[i].Code+"\t\t\t"+sub.students[i].GPA.getGpa()+"\t\t\t"+sub.students[i].GPA.getGrade());
            }
            printWriter.close(); // Close the PrintWriter
            
        } catch (IOException e) {
            System.err.println("Error creating the file: " + e.getMessage());
        }
        return("Text file created successfully: ");
    }
    
}
