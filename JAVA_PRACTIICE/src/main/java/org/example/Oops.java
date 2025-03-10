package org.example;

class BankAccount{
    private String accooundHolder;
    private double balance;

    public BankAccount(String accooundHolder, double balance){
        this.accooundHolder = accooundHolder;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposite(double amount){
        balance +=amount;
        System.out.println("Deposited:" +amount);
    }
}

class SavaingBankAccount extends BankAccount{
    private double interestRate;

    public SavaingBankAccount(String accooundHolder, double balance, double interestRate){
        super(accooundHolder, balance);
        this.interestRate = interestRate;
    }

    public void deposite(double amount){
        double interest = amount *(interestRate/100);
        super.deposite(amount +interest);

    }
}
public class Oops {
}
