/**
 * Assignment4 - COMP1030
 * @author Paulo Alves
 * @version 1.0
 * since 02/2023
 */
public class CollegeCourse {
    private Integer courseReferenceNumber;
    private Integer courseNumber;


    public CollegeCourse() {
    }

    public CollegeCourse(Integer courseReferenceNumber, Integer courseNumber) {
        this.courseReferenceNumber = courseReferenceNumber;
        this.courseNumber = courseNumber;
    }

    public Integer getCourseReferenceNumber() {
        return courseReferenceNumber;
    }

    public void setCourseReferenceNumber(Integer courseReferenceNumber) {
        this.courseReferenceNumber = courseReferenceNumber;
    }

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }
}
