public class StudentHarness {
    public static void main(String[] args) {

        Student student1 = new Student("Paulo Alves", 95);

        System.out.println("Hello! This is Georgian@ILAC. We are going to show the infos for first student:");
        System.out.println("Full name: " + student1.getFullName());
        System.out.println("Grade: " + student1.getGrade() + "%");
        System.out.println("---------------##---------------");

        Student student2 = new Student();
        student2.setFullName("Alexis Mora");
        student2.setGrade(81);
        System.out.println("Now the infos for Student 2:");
        System.out.println("Full name: " + student2.getFullName());
        System.out.println("Grade: " + student2.getGrade() + "%");
    }
}
