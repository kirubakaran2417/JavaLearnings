package oops;

public class NRIAccount extends Bankaccount{

    public NRIAccount(double balance) {
        super(balance);
    }

    public double calculateInterest(){
        return (balance*7.2)/100;
    }
}
