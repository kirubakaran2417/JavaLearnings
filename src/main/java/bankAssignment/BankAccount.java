package bankAssignment;

public class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    //constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    //static methods
    public static void deposit(BankAccount acc, double amount) {
        acc.balance += amount;//a+=b-->a==a+b
        System.out.println("Amount deposited successfully");
    }

    public static void withdraw(BankAccount acc, double amount) {
        if (amount > acc.balance) {
            System.out.println("Insufficient balance");
        } else {
            acc.balance -= amount;
            System.out.println("Amount withdrawn successfully");
        }
    }

    public static void checkBalance(BankAccount acc) {
        System.out.println("Account balance is: " + acc.balance);
    }

    public static void transferMoney(BankAccount fromacc, BankAccount toacc, double amount) {
        if (amount > fromacc.balance) {
            System.out.println("Insufficient funds for transfer");
        } else {
            fromacc.balance -= amount;
            toacc.balance += amount;
            System.out.println("Amount transferred successfully");
        }
    }
}