package com.jju;
public class BankAccount {
    private String accountHolder;
    protected double balance; // Protected so subclasses can see it, but not the public

     public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        
                if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }

        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        
         
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        
            
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }

        if (amount > balance) {
            throw new IllegalStateException("Insufficient balance.");
        }

        balance -= amount;

    }

    public double getBalance() {
        return balance;
    }
    public String getaccountHolder(){
        return accountHolder;
    }
}
