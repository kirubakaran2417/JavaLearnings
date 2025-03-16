package oops;

import org.openqa.selenium.WebElement;

public class Bankaccount {

//    method overriding

    protected double balance;

    public Bankaccount(double balance) {
        this.balance = balance;
    }

    public double calculateInterest(){
        return (balance*5)/100;//default interest rate of 5%
    }


    public void click(WebElement element){

    }
}
