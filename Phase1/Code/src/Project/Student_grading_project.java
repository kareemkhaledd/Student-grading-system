package Project;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author: Ahmed Helmy
 */
public class Student_grading_project {
    public static void main(String[] args) {
        // Test file path
        String filePath = "input_data.txt";
        //String filePath = "C:/Users/mh_sm/Dropbox/PC/Desktop/computer/SENIOR-1/Spring/Testing/Project/StudentsGrades/input_data.txt";

        // Open the file and retrieve student details
        String[] studentDetailsArray  = OpenFileClass.openFile(filePath);
        System.out.println("studentDetailsArray[0] = " + studentDetailsArray[0]);
        try {
            Subject sub1 = ParseFile.getSubject(studentDetailsArray);ParseFile.FillStudent(studentDetailsArray, sub1);
            System.out.println(sub1.students[0].Name);
            System.out.println(sub1.students[0].Code);
            System.out.println(sub1.students[0].ActivitiesMarks);
            System.out.println(sub1.Name);
            System.out.println(sub1.Code);
            System.out.println(sub1.FullMark);
            for (int i = 0; i < sub1.students.length; i++){
                sub1.students[i].GPA  = GPA.calculateGPAAndGrade ( sub1.students[i].ActivitiesMarks,
                    sub1.students[i].PracticalOralMarks, sub1.students[i].MidMarks,sub1.students[i].FinalMarks);
             }
             Output.make_file(sub1);
        }catch (InvalidDataException e){
            System.out.println(e.getMessage());
        }
    }
}
