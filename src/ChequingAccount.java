/**
 * This is the project for Assignment 3 - COMP1030
 * Author: Paulo Alves
 */
public class ChequingAccount {

    //CHALLENGE 1
    String firstName;
    String lastName;
    Integer balance;
    String accountNumber;

    public ChequingAccount(String firstName, String lastName, Integer balance, String accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
