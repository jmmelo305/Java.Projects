/*
 * Programmer: Jose Melo
 * Program: The Account Class
 * Purpose: A program made to --
 * Date: 10-15-2025
 */

import java.util.Date;
public class MeloAccountClass2{
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

/*class Account{

    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    public Account (){
        this (0, 0.0);
    }

    public Account (int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public static void getMonthlyInterestRate(){

    }
    
    
}
*/

// ...existing code...
class Account {

  // Implement the class here
  private int id = 0;
  private double balance = 0;
  private static double annualInterestRate = 0; // percentage, e.g. 4.5
  private Date dateCreated;

  // default constructor
  public Account() {
    this(0, 0.0);
  }

  // matches Account(1122, 20000) used in main
  public Account(int id, double balance) {
    this.id = id;
    this.balance = balance;
    this.dateCreated = new Date();
  }

  public int getId() { return id; }
  public void setId(int id) { this.id = id; }

  public double getBalance() { return balance; }
  public void setBalance(double balance) { this.balance = balance; }

  public static double getAnnualInterestRate() { return annualInterestRate; }
  public static void setAnnualInterestRate(double rate) { annualInterestRate = rate; }

  // returns the monthly interest amount (balance * monthly rate)
  public double getMonthlyInterest() {
    return balance * (annualInterestRate / 100.0) / 12.0;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public void withdraw(double amount) {
    if (amount <= 0) return;
    if (amount > balance) {
      System.out.println("Insufficient funds");
      return;
    }
    balance -= amount;
  }

  public void deposit(double amount) {
    if (amount <= 0) return;
    balance += amount;
  }
}
