package Project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class GPA {
    
    public static GPAResult calculateGPAAndGrade(int activitiesMark, int oralPracticalMark, int midtermMark, int finalExamMark) {
        int totalMark = activitiesMark + oralPracticalMark + midtermMark + finalExamMark;
        double gpa;
        String grade;

        if (totalMark >= 97 && totalMark <= 100) {
            gpa = 4.0;
            grade = "A+";
        } else if (totalMark >= 93 && totalMark < 97) {
            gpa = 4.0;
            grade = "A";
        } else if (totalMark >= 89 && totalMark < 93) {
            gpa = 3.7;
            grade = "A-";
        } else if (totalMark >= 84 && totalMark < 89) {
            gpa = 3.3;
            grade = "B+";
        } else if (totalMark >= 80 && totalMark < 84) {
            gpa = 3.0;
            grade = "B";
        } else if (totalMark >= 76 && totalMark < 80) {
            gpa = 2.7;
            grade = "B-";
        } else if (totalMark >= 73 && totalMark < 76) {
            gpa = 2.3;
            grade = "C+";
        } else if (totalMark >= 70 && totalMark < 73) {
            gpa = 2.0;
            grade = "C";
        } else if (totalMark >= 67 && totalMark < 70) {
            gpa = 1.7;
            grade = "C-";
        } else if (totalMark >= 64 && totalMark < 67) {
            gpa = 1.3;
            grade = "D+";
        } else if (totalMark >= 60 && totalMark < 64) {
            gpa = 1.0;
            grade = "D";
        } else if (totalMark < 0 || totalMark > 100) {
            throw new IllegalArgumentException("Invalid total mark");
        } else {
            gpa = 0.0;
            grade = "F";
        }

        return new GPAResult(gpa, grade);
    }
}



class GPAResult {
    private double gpa;
    private String grade;

    public GPAResult(double gpa, String grade) {
        this.gpa = gpa;
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public String getGrade() {
        return grade;
    }
}


