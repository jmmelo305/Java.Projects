//Remember to save file first and then commit for it to upload properly.

/*
 * Programmer: Jose Melo
 * Program: Method Practice
 * Purpose: A program that prompts the user to enter annual interest rate, number of years, and loan amount, and displays the monthly payment and total payment.
 * Date: 09-16-2025
 */



import java.util.Scanner;
public class MeloMethodsPractice{



    public static double getMonthlyPayment (double annualInterestRate, double numberOfYears, double loanAmount){
        
        System.out.println(monthlyPayment);
        return monthlyPayment;
        }

    public static double getTotalPayment(double annualInterestRate, double numberOfYears, double loanAmount){

        return output;
        }


    public static void main(String [] args){
        double yearlyInterestRate;
        double years_num;
        double loan_amt;
        
        Scanner input = new Scanner (System.in);

        yearlyInterestRate = input.nextDouble();
        years_num = input.nextDouble();
        loan_amt = input.nextDouble();



        getMonthlyPayment(yearlyInterestRate, years_num, loan_amt);
        getTotalPayment(yearlyInterestRate, years_num, loan_amt);
        



        


    
    }
}