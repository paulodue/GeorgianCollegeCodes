/**
 * This is the Project for Assignment 3 - COMP1030
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
