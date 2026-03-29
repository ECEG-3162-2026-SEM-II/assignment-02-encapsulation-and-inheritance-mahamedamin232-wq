package com.jju;

public class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.50;

      public CheckingAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance); 
        }
    @Override
    public void withdraw(double amount) {
       // 2. Student Task: Implement withdraw logic here
               if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }

        double totalAmount = amount + TRANSACTION_FEE;

        
        if (totalAmount > balance) {
            throw new IllegalStateException("Insufficient balance (including transaction fee).");
        }

        
        super.withdraw(totalAmount);
    
    }

    
}

