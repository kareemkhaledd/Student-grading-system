/*
 * @author Mohamed Abdel Hamid
 */
package Project;

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}
public class ParseFile {
    static Subject getSubject(String [] input) throws InvalidDataException {

        if(input.length>1) {
            // Split String
            String[] parts = input[0].split(",");

            if (parts.length == 3) {

                // Validate Subject name
                if (SubjectValidation.checkName(parts[0])) {

                } else
                    throw new InvalidDataException(parts[0] + " is Invalid");

                // Validate Subject code
                if (SubjectValidation.checkSubjectCode(parts[1])) {

                } else
                    throw new InvalidDataException(parts[1] + " is Invalid");

                // Validate Subject full mark
                if (SubjectValidation.checkFullMark(Integer.parseInt(parts[2]))) {

                } else
                    throw new InvalidDataException(parts[2] + " is Invalid");

                Subject sub = new Subject(input.length - 1);
                sub.Name = parts[0];
                sub.Code = parts[1];
                sub.FullMark = Integer.parseInt(parts[2]);
                return sub;
            } else
                throw new InvalidDataException("Invalid Subject Attributes");
        }else
            throw new InvalidDataException("Invalid input file: It has no students or has no subject");
    }

    static void FillStudent(String [] input , Subject sub) throws InvalidDataException {
        // Counter start from 1 --> start of students
            for (int i = 1; i < input.length; i++) {

                // Spilt string
                String[] parts = input[i].split(",");

                // We use the same function used to check subject name
                // to check student name as they have same constraints
                if (SubjectValidation.checkName(parts[0])) {

                } else
                    throw new InvalidDataException(parts[0] + " is Invalid");

                // Validate student number
                if (DataCheck.CheckStudentNumber(parts[1])) {

                } else
                    throw new InvalidDataException(parts[1] + " is Invalid");

                // Validate activities marks
                if (DataCheck.CheckActivitiesMark(Integer.parseInt(parts[2]), sub.FullMark)) {

                } else
                    throw new InvalidDataException(parts[2] + " is Invalid");

                // Validate practical marks
                if (DataCheck.CheckOralPracticalMark(Integer.parseInt(parts[3]), sub.FullMark)) {

                } else
                    throw new InvalidDataException(parts[3] + " is Invalid");

                // Validate midterms marks
                if (DataCheck.CheckMidtermExamMark(Integer.parseInt(parts[4]), sub.FullMark)) {

                } else
                    throw new InvalidDataException(parts[4] + " is Invalid");

                // Validate final marks
                if (DataCheck.CheckFinalExamMark(Integer.parseInt(parts[5]), sub.FullMark)) {

                } else
                    throw new InvalidDataException(parts[5] + " is Invalid");
                sub.students[i - 1].Name = parts[0];
                sub.students[i - 1].Code = parts[1];
                sub.students[i - 1].ActivitiesMarks = Integer.parseInt(parts[2]);
                sub.students[i - 1].PracticalOralMarks = Integer.parseInt(parts[3]);
                sub.students[i - 1].MidMarks = Integer.parseInt(parts[4]);
                sub.students[i - 1].FinalMarks = Integer.parseInt(parts[5]);
            }
        }
    }


