import java.util.Objects;
import java.util.Scanner;

public class Tasks1n2 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Please enter the first value: ");
        int a = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Please enter the second value: ");
        int b = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Please enter the arithmetic operator: ");
        String c = sc3.nextLine();


//        //TASK 1
        if (Objects.equals(c, "+")) {
            System.out.println(Math.addExact(a, b));
        } else if (Objects.equals(c, "-")) {
            System.out.println(Math.subtractExact(a, b));
        } else if (Objects.equals(c, "*")) {
            System.out.println(Math.multiplyExact(a, b));
        } else if (Objects.equals(c,"/")) {
            System.out.println(Math.divideExact(a, b));
        } else if(Objects.equals(c, "%")) {
            System.out.println(Math.ceilMod(a, b));
        } else if (Objects.equals(c, "^")) {
            System.out.println(Math.pow(a, b));
        } else {
            System.out.println("You entered a invalid operator! Please use only '=', '-', '*', '/', '%' or '^'");
        }

        //TASK 2
        switch(c) {
            case "+":
                System.out.println(Math.addExact(a, b));
                break;
            case "-":
                System.out.println(Math.subtractExact(a, b));
                break;
            case "*":
                System.out.println(Math.multiplyExact(a, b));
                break;
            case "/":
                System.out.println(Math.divideExact(a, b));
                break;
            case "%":
                System.out.println(Math.ceilMod(a, b));
                break;
            case "^":
                System.out.println(Math.pow(a, b));
                break;
            default:
                System.out.println("You entered a invalid operator! Please use only '=', '-', '*', '/', '%' or '^'");
        }
    }
}