/*
 * @author Mohamed Abdel Hamid
 */
package Project;

import java.util.Objects;

public class Student {
    String Name;
    String Code;
    GPAResult GPA ;
    int ActivitiesMarks;
    int PracticalOralMarks;
    int MidMarks;
    int FinalMarks;

    public Student() {

    }

    public Student(String name, String code, int activitiesMarks, int practicalOralMarks, int midMarks, int finalMarks) {
        Name = name;
        Code = code;
        this.GPA = GPA;
        ActivitiesMarks = activitiesMarks;
        PracticalOralMarks = practicalOralMarks;
        MidMarks = midMarks;
        FinalMarks = finalMarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return ActivitiesMarks == student.ActivitiesMarks && PracticalOralMarks == student.PracticalOralMarks && MidMarks == student.MidMarks && FinalMarks == student.FinalMarks && Objects.equals(Name, student.Name) && Objects.equals(Code, student.Code);
    }

}
