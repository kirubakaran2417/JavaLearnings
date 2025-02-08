package bankAssignment;

import java.util.Scanner;

public class BankOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //create two bank accounts
        BankAccount account1=new BankAccount("SA1234","Aravind",45000);
        BankAccount account2=new BankAccount("SA5678","Bharath",50000);

        //loop to allow repeated operations
        while(true){
            System.out.println("\nChoose an operation:");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Transfer");
            System.out.println("4.Check Balance");
            System.out.println("5.Exit");

            int choice=scanner.nextInt();

            if(choice==1){
                System.out.println("Enter deposit amount:");
                double amount=scanner.nextDouble();
                BankAccount.deposit(account1,amount);
            } else if (choice==2) {
                System.out.println("Enter withdraw amount:");
                double amount=scanner.nextDouble();
                BankAccount.withdraw(account1,amount);
            } else if (choice==3) {
                System.out.println("Enter transfer amount:");
                double amount=scanner.nextDouble();
                BankAccount.transferMoney(account1,account2,amount);
            } else if (choice==4) {
                BankAccount.checkBalance(account1);
            } else if (choice==5) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
