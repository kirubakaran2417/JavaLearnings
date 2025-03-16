package oops;

public class BankACcount2 {

    private double balance;

    public BankACcount2(double initialbalance){
        if (initialbalance>=0){
            this.balance=initialbalance;
        }else{
            System.out.println(" Initial balance cannot be negative ");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount>0){
            balance=balance+amount;
        }else{
            System.out.println("Deposit amount cannot be negative");
        }
    }

    public void withdraw(double amount){
        if (amount>0){
            balance=balance-amount;
        }else{
            System.out.println("Withdrawal amount cannot be negative");
        }
    }

}
