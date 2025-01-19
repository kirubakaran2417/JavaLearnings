package bankSampleProgram;

public class Main {

    public static void main(String[] args) {

        BankAccount sbi=new BankAccount();
        BankAccount icici=new BankAccount(12345,"Aravind",10000);
        icici.displayAccountDetails();
        icici.deposit(7000);
        icici.withdraw(2500);

    }
}
