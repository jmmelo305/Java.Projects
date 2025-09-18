/*
 * Programmer: Jose Melo
 * Program: Computing Future Investment Value
 * Purpose: A program that by using methods computes future investment values at a given interest rate for a specified number of years.
 * Date: 09/17/2025
 */



import java.util.Scanner;

public class MeloCompInvestValue{
    public static void main (String [] args){
        
        double investmentAmt ;
        double interestRate;
        double monthlyInterestRate;
        int numberOfYears = 1;


        Scanner input = new Scanner (System.in);
        System.out.println("Enter Amount Invested: ");
        investmentAmt = input.nextDouble();
        System.out.println(" ");
        System.out.println("Enter Annual Interest Rate: ");
        interestRate = input.nextDouble();
        input.close();

        interestRate /= 100;

        monthlyInterestRate = interestRate / 12;

        System.out.println("");
        System.out.println("The amount invested: " + investmentAmt);
        System.out.println("Annual interest rate: " + interestRate);
        
        System.out.println("Years           Future Value");
        while (numberOfYears <= 30){
            double result = futureInvestmentValue (investmentAmt,monthlyInterestRate,numberOfYears);
            System.out.println(numberOfYears + "               " + String.format("%.2f",result));
            numberOfYears ++;
        }
        
        
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears){
        double futureInvestmentValue;        
        futureInvestmentValue = investmentAmount * Math.pow (1 + monthlyInterestRate, numberOfYears * 12 );
        return futureInvestmentValue;
    }
}