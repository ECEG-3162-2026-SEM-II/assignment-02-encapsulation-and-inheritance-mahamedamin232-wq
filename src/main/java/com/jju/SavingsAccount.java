package com.jju;

public class SavingsAccount extends BankAccount {
    private double interestRate; 

   public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);

        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }

        this.interestRate = interestRate;
    }
    public void applyInterest() {
        
        double interest = balance * interestRate;

        
        this.deposit(interest);
    }

 
    public double getInterestRate() {
        return interestRate;
    }
}

