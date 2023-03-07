import java.util.Arrays;

public class CollegeCourseTestHarness {
    public static void main(String[] args) {
        int rows = 200;
        int columns = 10;

        int[] courseArray = new int[rows];
        Arrays.fill(courseArray, 0, 100, 0 );
        Arrays.fill(courseArray, 101, 200, 9999);

        for (int ints : courseArray) {
            System.out.print(ints + " ");
        }

    }
}
