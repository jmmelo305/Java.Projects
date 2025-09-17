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
        int numberOfYears;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter Amount Invested: ");
        investmentAmt = input.nextDouble();
        System.out.println(" ");
        System.out.println("Enter Annual Interest Rate: ");
        interestRate = input.nextDouble();
        input.close();


        futureInvestmentValue(investmentAmt, interestRate, numberOfYears);


    }

    public static double futureInvestmentValue(double investmentAmount, double annualInterestRate, int years){
        double futureInvestmentValue = (investmentAmount * (1 + annualInterestRate) * years * 12);
        System.out.println("")
        System.out.println("The amount invested: " + investmentAmount);
        System.out.println("Annual interest rate: " + annualInterestRate);
        System.out.println("Years           Future Value");
        System.out.println(years + "               " + futureInvestmentValue);

        return futureInvestmentValue;

    }
}