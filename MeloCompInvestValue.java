/*
 * Programmer: Jose Melo
 * Program: Computing Future Investment Value
 * Purpose: A program that by using methods computes future investment values at a given interest rate for a specified number of years.
 * Date: 09/17/2025
 */


//Import Scanner for inputs.
import java.util.Scanner;

public class MeloCompInvestValue{
    public static void main (String [] args){
        
        //Declare Variables
        double investmentAmt ;
        double interestRate;
        double monthlyInterestRate;
        int numberOfYears = 1;

        //Use Scanner for inputs and assign them to their corresponding variable
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Amount Invested: ");
        investmentAmt = input.nextDouble();
        System.out.println(" ");
        System.out.println("Enter Annual Interest Rate: ");
        interestRate = input.nextDouble();
        input.close();

        //Print Statements to get the table organized.
        System.out.println("");
        System.out.println("The amount invested: " + investmentAmt);
        System.out.println("Annual interest rate: " + interestRate + "%");
        System.out.println("Years           Future Value");

        //Convert interest rate percentage into a decimal
        interestRate /= 100;

        //Convert decimal annual interest rate into monthly interest rate
        monthlyInterestRate = interestRate / 12;

        //While loop to pull the "futureInvestmentValue" method and run it for 30 years - I got string format from w3schools
        while (numberOfYears <= 30){
            double result = futureInvestmentValue (investmentAmt,monthlyInterestRate,numberOfYears);
            System.out.println(numberOfYears + "               " + String.format("%.2f",result));
            numberOfYears ++;
        }
        
        
    }

    //futureInvestmentValue method that contains the math to calculate futureInvestmentValues.
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears){
        double futureInvestmentValue;        
        futureInvestmentValue = investmentAmount * Math.pow (1 + monthlyInterestRate, numberOfYears * 12 );
        return futureInvestmentValue;
    }
}