import java.util.Arrays;

public class CollegeCourseTestHarness {
    public static void main(String[] args) {

        int rows = 200;
        int columns = 10;

        int[][] courseArray = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++) {
                if (i < 100){
                    courseArray[i][j] = 0;
                } else {
                    courseArray[i][j] = 9999;
                }
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++) {
                System.out.print(courseArray[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
