package bank;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("You do not have enough money");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            this.balance -= amount;
        } else {
            System.out.println("You do not have enough money");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123");
        bankAccount.deposit(100.99);
        bankAccount.withdraw(10.02);
        System.out.println(bankAccount.balance);
    }
}
