//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccount[] bankAccounts = new BankAccount[4];

        bankAccounts[0] = new SavingsAccount("DBBL01", 500);
        bankAccounts[1] = new CheckingAccount("IBBL02", 1000);
        bankAccounts[2] = new SavingsAccount("TRUST03", 6000);
        bankAccounts[3] = new CheckingAccount("NRB04", 66600);

        for (BankAccount account : bankAccounts) {
            account.deposit(6000);
            account.withdraw(1000);
            System.out.println(".................................................................................");
            System.out.println("Current balance in account " + account.accountNumber + ": " + account.getBalance());
        }
    }
}