/*
 * Programmer: Jose Melo
 * Purpose: 
 * Program: OOP Practice 
 * Date: 10-21-2025
 */

import java.math.BigInteger;
import java.util.Scanner;
public class MeloOOPPractice {
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



/*
        String stringOfN;
        String stringOfK;
        BigInteger bigIntN;
        BigInteger bigIntK; 


        stringOfN = String.valueOf(n);
        stringOfK = String.valueOf(k);

        bigIntN = new BigInteger (stringOfN);
        bigIntK = new BigInteger (stringOfK);

        /*BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        

        int result = (n / (k * (n-k)));
        String stringOfR;
        stringOfR = String.valueOf(result);
        BigInteger bigIntR;
        bigIntR = new BigInteger (stringOfR);

*/ 
    }
    
}
