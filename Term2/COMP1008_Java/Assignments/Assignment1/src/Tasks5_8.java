import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tasks5_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the number of size of array: ");
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the array element one by one: ");
        for(int i=0;i<size;i++) {
            a[i] = sc.nextInt();
        }
        for(int i : a) {
            System.out.print("[" + i + "]");
        }
    }
}
