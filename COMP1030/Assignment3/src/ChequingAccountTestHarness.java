public class ChequingAccountTestHarness {
    public static void main(String[] args) {
        //CHALLENGE 2

        ChequingAccount chequingAccount = new ChequingAccount("Paulo", "Alves", 1000, "001");

        System.out.println("Hello, " + chequingAccount.getFirstName() + " " + chequingAccount.getLastName() + ". Welcome to the bank!");
        System.out.println("Your account number is: " + chequingAccount.getAccountNumber());
        System.out.println("Your current balance is: " + chequingAccount.getBalance());

        //CHALLENGE 3
        chequingAccount.setFirstName("Guilherme");
        chequingAccount.setLastName("Gomes");
        //I'm using this variable to get the full name easier
        String fullName = chequingAccount.getFirstName() + " " + chequingAccount.getLastName();
        System.out.println("The full name account has been changed to: " + fullName);
        System.out.println("Your new account number is: " + chequingAccount.getAccountNumber());
        System.out.println("Your current balance is: " + chequingAccount.getBalance());
    }
}
