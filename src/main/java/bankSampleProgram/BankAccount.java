package bankSampleProgram;

public class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;
    /*this keyword=When a local variable has same name as global variable
    then this keyword is used to refer to the global variable explicitly*/
    //if i create an object then constructor is called
    //default constructor
    public BankAccount(){}
    //parameterized constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    //method to display account details
    public void displayAccountDetails(){
        System.out.println("Account number is: "+accountNumber);
        System.out.println("Account holder name is: "+accountHolderName);
        System.out.println("Account balance is: "+balance);
    }
    //method to deposit
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("Amount deposited successfully");
        System.out.println("Updated balance after deposit is: "+balance);
    }
    //method to withdraw
    public void withdraw(double amount){
        balance=balance-amount;
        System.out.println("Amount withdrawn successfully");
        System.out.println("Updated balance after withdrawal is: "+balance);
    }


}
