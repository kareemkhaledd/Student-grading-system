/*
 * @author Mohamed Abdel Hamid
 */
package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Subject extends ArrayList<Student> {
    String Name ;
    String Code;
    int FullMark;
    Student[] students;

    public Subject() {
    }

    public Subject(int noOfStudents) {
        students = new Student[noOfStudents];
        for(int i=0; i<noOfStudents;i++){
            students[i]=new Student();
        }

    }

    public Subject(String name, String code, int fullMark, Student[] students) {
        Name = name;
        Code = code;
        FullMark = fullMark;
        this.students = students;
    }

    public Subject(String name, String code, int fullMark) {
        Name = name;
        Code = code;
        FullMark = fullMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject subject)) return false;
        return FullMark == subject.FullMark && Objects.equals(Name, subject.Name) && Objects.equals(Code, subject.Code);
    }
}
