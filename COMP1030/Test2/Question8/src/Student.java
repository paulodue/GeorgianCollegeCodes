public class Student {

    private String fullName;
    private Integer grade;

    public Student(String fullName, Integer grade) {
        this.fullName = fullName;
        this.grade = grade;
    }
    public Student(){
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
