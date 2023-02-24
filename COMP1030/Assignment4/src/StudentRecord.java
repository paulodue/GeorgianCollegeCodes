/**
 * Assignment4 - COMP1030
 * @author Paulo Alves
 * @version 1.0
 * since 02/2023
 */

//CHALLENGE 2
public class StudentRecord {
    private String firstName;
    private String lastName;
    private String studentID;
    private Integer gradeCourseOne;


    public StudentRecord(String firstName, String lastName, String studentID, Integer gradeCourseOne) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.gradeCourseOne = gradeCourseOne;
    }

    public StudentRecord() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Integer getGradeCourseOne() {
        return gradeCourseOne;
    }

    public void setGradeCourseOne(Integer gradeCourseOne) {
        this.gradeCourseOne = gradeCourseOne;
    }

    public String returnLetterForCourseGrade() {
        Integer gradeToLetter = getGradeCourseOne();
        String letterA = "A";
        String letterB = "B";
        String letterC = "C";
        String letterD = "D";
        String letterE = "E";
        String letterF = "F";

        if (gradeToLetter >= 90 && gradeToLetter <= 100) {
            return letterA;
        } else if (gradeToLetter >= 80 && gradeToLetter <= 89) {
            return letterB;
        } else if (gradeToLetter >= 70 && gradeToLetter <= 79) {
            return letterC;
        } else if (gradeToLetter >= 60 && gradeToLetter <= 69) {
            return letterD;
        } else if (gradeToLetter >= 50 && gradeToLetter <= 59) {
            return letterE;
        } else if (gradeToLetter <= 49 && gradeToLetter >= 0) {
            return letterF;
        } else {
            throw new RuntimeException("ERROR! Invalid number entered for a grade (should be between 0 and 100)");
        }
    }

    public Integer returnNumberOfVowels(String nameToCountVowels) {
        Integer count = 0;
            for (int i = 0; i < nameToCountVowels.length(); i++) {
                char vowels = nameToCountVowels.charAt(i);
                if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u') {
                    count++;
                }
            }
        return count;
    }
}