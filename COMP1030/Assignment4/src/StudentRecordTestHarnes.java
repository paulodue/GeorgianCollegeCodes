import javax.management.ObjectName;
import java.util.Scanner;

/**
 * Assignment4 - COMP1030
 * @author Paulo Alves
 * @version 1.0
 * since 02/2023
 */

//CHALLENGE 3
public class StudentRecordTestHarnes {
    public static void main(String[] args) {
        StudentRecord stu1 = new StudentRecord("Paulo", "Alves", "34560", 99);

        System.out.println("Hello, welcome to Georgian@ILAC! Here you can get all the informations about the first student of this course!");
        System.out.println("First Name: " + stu1.getFirstName());
        System.out.println("Last Name: " + stu1.getLastName());
        System.out.println("Student ID: " + stu1.getStudentID());
        System.out.println("This student got grade of: " + stu1.getGradeCourseOne());
        System.out.println("----------------------------###----------------------------");

        StudentRecord stu2 = new StudentRecord();

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Set a name for Student 2: ");
        String nameForStudent = scan1.next();
        stu2.setFirstName(nameForStudent);
        System.out.println("The first name for Student 2 is: " + stu2.getFirstName());


        Integer numberOfVowels = stu2.returnNumberOfVowels(stu2.getFirstName());
        if(numberOfVowels <= 7 ) {
            System.out.println("The number of vowels on Student 2 name is: " + numberOfVowels);
        } else {
            System.out.println("The name entered is more then 5 letters length, counting on vowels is not gonna happen");
        }

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Set a last name for Student 2: ");
        String lastNameForStudent = scan2.next();
        stu2.setLastName(lastNameForStudent);
        System.out.println("The last name for Student 2 is: " + stu2.getLastName());

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Set an ID for Student 2: ");
        String idForStudent = scan3.next();
        stu2.setStudentID(idForStudent);
        System.out.println("The ID for Student 2 is: " + stu2.getStudentID());

        Scanner scan4 = new Scanner(System.in);
        System.out.print("Set a Grade for Student 2: ");
        Integer gradeForStudent = scan3.nextInt();
        stu2.setGradeCourseOne(gradeForStudent);
        System.out.println("The Grade for Student 2 is: " + stu2.getGradeCourseOne());
        System.out.println("----------------------------###----------------------------");

        System.out.println("The representation for Student 2 grade in a letter is: " + stu2.returnLetterForCourseGrade());


    }
}
