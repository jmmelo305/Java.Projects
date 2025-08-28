/*
 * Proper Fractions, Improper Fractions, and Mixed Fractions
 * A program that one inputs a numerator and denominator and determines whether it's a proper or improper fraction, if is improper than it converts into a mixed fraction
 * 8/27/2025
 * Jose Melo
 */
 
//Imports Scanner
import java.util.Scanner;
public class FractionCalculator {
    public static void main(String [] args){
    
    //Ask for numerator and denominator inputs
      Scanner input = new Scanner (System.in);
      System.out.println("Enter a numerator and denominator");

    //Processes inputs and calculates the fraction and the remainder
      int numerator = input.nextInt();
      int denominator = input.nextInt();
      int calculation = (numerator / denominator);
      int remainder = (numerator % denominator);
     
     //If remainder equals numerator then fraction is proper
      if (remainder == numerator){
          System.out.println(numerator + " / " + denominator + " is a proper fraction");
      }
      
     //If remainder is smaller than the numerator but bigger than 0 it is improper that can be converted to a mixed fraction
      else if (remainder <= numerator && remainder > 0){
        String mixedFraction = (remainder + " / " + denominator);
        System.out.println(numerator + " / " + denominator + " is an improper fraction and it's mixed fraction is: " + calculation + " + " + mixedFraction);
      }
      
      //If remainder is equal to 0 then the fraction is improper and can be reduced to a whole number
        else if (remainder == 0){
            System.out.println(numerator + " / " + denominator + " is an improper fraction and it can be reduced to " + calculation);
        }   
    }
}

