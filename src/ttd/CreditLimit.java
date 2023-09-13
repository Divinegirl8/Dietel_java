package ttd;

public class CreditLimit {

    private  int accountNumber;
    private int balance;
    private int itemsCharged;
    private int totalCredit;

    private  int allowedCredit;

    private boolean creditLimit;


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setItemsCharged(int itemsCharged) {
        this.itemsCharged = itemsCharged;
    }

    public int getItemsCharged() {
        return itemsCharged;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public int getTotalCredit() {
        return totalCredit;
    }


    public void setAllowedCredit(int allowedCredit) {
        this.allowedCredit = allowedCredit;
    }

    public int getAllowedCredit() {
        return allowedCredit;
    }

    public  boolean getCreditLimit() {
        return creditLimit;
    }
    public int newBalance(int balance ,int itemsCharged, int totalCredit) {

        return balance + (itemsCharged - totalCredit);

    }

    public boolean creditLimit() {
        if ( balance + (itemsCharged - totalCredit)  < getAllowedCredit()) {
           return creditLimit = true;
        }
        else {
            return creditLimit = false;
        }
    }

}
