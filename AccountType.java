/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmain;

public class AccountType {
    int accountType;
    double interestRate;
    
    public AccountType(int accountType) //constructor
    {
        this.accountType = accountType;
        
        if (accountType == 1)
        {
//            type = "Checking";
            interestRate = 0.01;
        }
        else if (accountType == 2)
        {
//            type = "Saving";
            interestRate = 0.02;
        }
    }
    
    public double getInterestRate()
    {
        return interestRate;
    }
}
    

