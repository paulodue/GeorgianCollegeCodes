public class Bank {

    private Integer numberOfClients;
    private String accountDetails;
    private Integer accountNumber;
    private Double amount;

    public Bank(String accountDetails, Integer accountNumber, Double amount) {
        this.accountDetails = accountDetails;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    public Bank() {

    }

    public Integer getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(Integer numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    public String getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(String accountDetails) {
        this.accountDetails = accountDetails;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
