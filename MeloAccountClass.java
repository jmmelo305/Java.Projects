/*
 * Programmer: Jose Melo
 * Program: The Account Class
 * Purpose: A program made to --
 * Date: 10-15-2025
 */


 //import java Date to use Date variable in program
import java.util.Date;

//Create main class
public class MeloAccountClass{

  //Create main method within main class that pulls all the data from other classes and methods
    public static void main (String [] args){
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

//Creates second class called Account
class Account {

  //Assigns variables and default values
  private int id = 0;
  private double balance = 0;
  private static double annualInterestRate = 0; // percentage, e.g. 4.5
  private Date dateCreated;

  //no-arg constructor
  public Account() {
    this(0, 0.0);
  }

  //Creates method Account within Account class and assigns local variables to each value
  public Account(int id, double balance) {
    this.id = id;
    this.balance = balance;
    this.dateCreated = new Date();
  }
  //Method to be able to use the private ID variable
  public int getId() { 
    return id; 
  }
  //Method to assign variable "ID"
  public void setId(int id) { 
    this.id = id; 
  }
  //getBalance method to be able to use the private balance variable
  public double getBalance() {
     return balance;
  }
  //Method to assign variable "balance"
  public void setBalance(double balance) {
     this.balance = balance; 
  }
  //Method used to be able to use the private annualinterestrate variable
  public static double getAnnualInterestRate() {
     return annualInterestRate; 
    }

  //Method to assign variable annualinterestrate
  public static void setAnnualInterestRate(double rate) {
     annualInterestRate = rate; 
    }

  //Method that uses annualinterestrate to calculate the monthlyinterest rate
  public double getMonthlyInterest() {
    return balance * (annualInterestRate / 100.0) / 12.0;
  }
  //Method that uses the import java.util.date to grab the date (although it is in UTC time zone)
  public Date getDateCreated() {
    return dateCreated;
  }

  //Withdraw method is used to withdraw a specified amount from the account.
  public void withdraw(double amount) {
    if (amount <= 0) return;
    if (amount > balance) {
      System.out.println("Insufficient funds");
      return;
    }
    balance -= amount;
  }
  //Deposit method that deposists a specified amount to the account.
  public void deposit(double amount) {
    if (amount <= 0) return;
    balance += amount;
  }
}