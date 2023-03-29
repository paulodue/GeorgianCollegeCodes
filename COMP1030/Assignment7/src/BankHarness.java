import java.util.Scanner;

public class BankHarness {
    public static void main(String[] args) {

        Bank client1 = new Bank();
        System.out.println("This is the beginning of the Bank Program! :D");

        System.out.println("Type how many accounts you would like to create: ");
        Scanner scan1 = new Scanner(System.in);
        Integer numberOfAccountToBeCreated = scan1.nextInt();
        client1.setNumberOfClients(numberOfAccountToBeCreated);


    }
}
