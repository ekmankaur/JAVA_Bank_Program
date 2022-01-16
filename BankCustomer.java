/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmain;

public class BankCustomer {
    int accountID;
    double balance = 0.0;
    int accountType = 0;
    AccountType acType; // will input whether savings or checking account is being opened
    
    public BankCustomer(int accountID, double balance, int accountType) //constructor
    {
        this.accountID = accountID;
        this.balance = balance;
        acType = new AccountType(accountType);
    }
    
    public int getID ()
    {
        return accountID;
    }
    
    public double getBalance ()
    {
        return accountID;
    }
    
    public int getType()
    {
        return accountType;
    }
   
     public void makeDeposit(double amount) //method for deposit which shows balance by calling the displaycuurent
     {
         balance = balance + amount;
     }
     
     public void withdrawMoney (double amount) //method for withdrawing which shows balance by calling the displaycuurent
     {
         if (amount <= balance)
         {
             balance = balance - amount;
         }
         else 
         {
             System.out.println("Insufficient Balance");
         }
     }
     
     public double calcInterestMoney(int accountType) //method which calculates interest amount and returns the amount
     {
         double interestAmt;
         
//      interest time is (1) for one year time span 
         interestAmt = (balance * acType.getInterestRate() * 1) / 100; 
         
         return interestAmt;
     }
    
}
