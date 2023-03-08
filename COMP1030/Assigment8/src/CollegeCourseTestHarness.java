import java.util.Arrays;

public class CollegeCourseTestHarness {
    public static void main(String[] args) {
        int rows = 20;
        int columns = 5;

        int[] courseArray = new int[rows];
        Arrays.fill(courseArray, 0, 10, 0 );
        Arrays.fill(courseArray, 11, 20, 9999);

        for (int ints : courseArray) {
            System.out.print(ints + " ");
        }

        String newLine = System.getProperty("line.separator");
        System.out.println(newLine + courseArray.length);



    }
}
