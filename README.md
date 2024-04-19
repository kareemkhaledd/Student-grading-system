# Student Grading Application

## Description
This Java application is designed to process student grades for a given subject. It reads input data from a file, calculates the GPA, and assigns grades to each student, and outputs the results to another file.

## Input Data Format
The input data file should follow the format below:
- First Line: Subject name, subject code, and full mark separated by commas.
- Subsequent Lines: Student name, student number, activity mark, oral/practical mark, midterm exam mark, and final exam mark separated by commas.

## Input Validation
The application validates the input data according to the following rules:
1. Subject name: Alphabetic characters and spaces, not starting with a space.
2. Subject code: 6-7 alphanumeric characters, with the first 3 being alphabetic followed by 3 numeric characters. The seventh character is optional and should be 's' if it exists.
3. Full mark: Numeric value of 100.
4. Student name: Alphabetic characters and spaces, not starting with a space.
5. Student number: Alphanumeric characters of exactly 8 characters length, starting with numbers and might end with only one alphabetic character.
6. Activity, oral/practical, midterm, and final exam marks: Integer values within their respective ranges.

## Output Format
The output file contains:
- First line of each page: Subject Name: [subject name]     Max Mark: [full mark]
- Table header: Student name     Student number     GPA     Grade
- Subsequent lines: Student's name, student number, GPA, and grade separated by spaces.

## Testing Methodology
- **Unit Testing**: Each unit of the application is tested separately.
- **White Box, Data Flow, and Black Box Testing**: These testing methods are employed to ensure thorough testing of the application.
- **Integration Testing**: Integration testing is conducted to verify the interaction between different units of the application.

## Authors
| Name                      | ID       |
|---------------------------|----------|
| Mohamed Abdelhamid Abdel  | 2001087  |
| Anas Hamed Ahmed          | 2001584  |
| Karim Khalid Abdelazim    | 2001091  |
| Mariam Ahmed Abdelgalil   | 2001273  |
| Sara Ashraf Abdelhakam    | 2000337  |
| Ahmed Gamal Helmy         | 2000082  |
