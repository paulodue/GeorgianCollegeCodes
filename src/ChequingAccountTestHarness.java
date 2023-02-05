public class ChequingAccountTestHarness {


    public static void main(String[] args) {

        //CHALLENGE 2
        ChequingAccount ChequingAccount = new ChequingAccount("Paulo", "Alves", 1000, "001");
        System.out.print("Hello " + ChequingAccount.getFirstName() + " " + ChequingAccount.getLastName() + "!");
        System.out.println(" This are the informations for your account: ");
        System.out.println("Your account number is: " + ChequingAccount.getAccountNumber());
        System.out.println("Your current balance is: " + ChequingAccount.getBalance());

        //CHALLENGE 3 - I created a variable called fullName to not need to call firstName and lastName getter a lot of times.
        ChequingAccount.setFirstName("Guilherme");
        ChequingAccount.setLastName("Gomes");

        String fullName = ChequingAccount.getFirstName() + " " + ChequingAccount.getLastName();

        System.out.println("Now the full name changed to: " + fullName);
    }
}
