/*
 * Programmer: Jose Melo
 * Purpose: A program made to find a specific value in an array using user input.
 * Program: Exceptions Practice
 * Date: 11-05-2025
 */

import java.util.Random;
import java.util.Scanner;
public class MeloExceptionsPractice {
    public static void main (String [] args){
        
        int index;
        double [] numbers = new double[100];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++){
            numbers [i] = rand.nextInt(1000);
        }

        Scanner input = new Scanner (System.in);
        System.out.println("Enter an index: ");
        index = input.nextInt();
        input.close();

        if (index >= 0 && index < numbers.length){
            System.out.println("Value at Index: " + index + " is: " + numbers[index]);
        }

        else{
            System.out.println("Out of Bounds");
        }

        input.close();
    }
}
