public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit (double amount) {
         balance+=amount;
        System.out.println("Account number is "+ accountNumber+" and Deposited money = "+ amount);

    }


    public boolean withdraw  (double amount) {
        if (balance>=amount){
            balance -=amount;
            System.out.println("Account number is " + accountNumber+" withdraw amount is " + amount );
            return true;
        }else {
            System.out.println("Insufficient balance in account : " + accountNumber);
            return false;
        }

    }


    public double getBalance() {
        return balance;
    }
}
