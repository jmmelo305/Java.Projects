/*
 * Programmer: Jose Melo
 * Program: The Account Class
 * Purpose: A program made to --
 * Date: 10-15-2025
 */

import java.util.Date;
public class MeloAccountClass {
  public static void main (String[] args) {
    Account account = new Account(1122, 20000);
    Account.setAnnualInterestRate(4.5);
    
    
    account.withdraw(2500);
    account.deposit(3000);
    System.out.println("Balance is " + account.getBalance());
    System.out.println("Monthly interest is " +
      account.getMonthlyInterest());
    System.out.println("This account was created at " +
      account.getDateCreated());
  }
}

class account {

  // Implement the class here
  private int id = 0;
  private double balance = 0;
  private double annualInterestRate = 0;
  private Date dateCreated;

 

  public static void defaultAccount (){

  }
  
  public double getMonthlyInterest(){


  }

  public Date getDateCreated(){
    
  }
  public static double withdraw (double amount){

  }

  public static double deposit (double amount){

  }


}
