/*
 * Programmer: Jose Melo
 * Purpose: Find the maximum combinations that can be made with 2 numbers
 * Program: OOP Practice 
 * Date: 10-21-2025
 */


//Import Scanner (import to be able to input numbers into code)
//and math.BigInteger (import to be able to use BigInteger variable type)
import java.math.BigInteger;
import java.util.Scanner;

//Main Class
public class MeloOOPPractice {
    //Main method - tester, asks for inputs and pulls methods to run
    public static void main (String [] args){

        int n;
        int k;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = input.nextInt();
        System.out.println();
        System.out.println("Enter k");
        k = input.nextInt();
        input.close();


        System.out.println("The C " + "(" + n + "," + k + ") is " + getNumberOfCombinations(n, k));

    }
    //Create getNumberOfCombinations Method that runs and determines 
    //the maximum number of combinations using the 
    //arguments provided

    public static BigInteger getNumberOfCombinations (int n, int k){
        if (k > n) {
            return BigInteger.ZERO;
        }

        if (k == 0 || k == n){
            return BigInteger.ONE;
        }

        k = Math.min (k, n - k );

        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator = BigInteger.ONE;

        for (int i = 1; i <= k; i++){
            numerator = numerator.multiply(BigInteger.valueOf(n - k + i));
            denominator = denominator.multiply(BigInteger.valueOf(i));
        }

        return numerator.divide(denominator);
    }
    
}
