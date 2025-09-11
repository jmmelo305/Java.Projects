/*
 * Name: Jose Melo
 * Date: 9/11/2025
 * Purpose: Program that reads integers, finds the largest number out of them, and counts its occurrences.
 * Class: CSC 151
 */


//import Scanner for inputs.
import java.util.Scanner;
public class MeloMaxValue{
    public static void main(String [] args){

    //Declare variables max, count, number and set max and count to 0
    int max = 0;
    int count = 0;
    int number;

    //Use scanner for inputs and assign them to the variable number.
    System.out.println("Enter list of numbers");
    Scanner input = new Scanner (System.in);
    number = input.nextInt();

    //Use a while loop that as long as the number isn't = 0 it loops through the code.
    //If the number is greated than max, then you assign max that number and reset the count.
    //If the number is equal to max, then add 1 to count until you don't have that number anymore.
    while (number != 0){
        if (number > max){
            max = number; 
            count = 1;
        }

        else if (number == max){
        count ++;
        }
        
        number = input.nextInt();
    }  

    //Print statements displaying outputs of max and count variables.
    System.out.println(" ");
    System.out.println("The largest number is: " + max);
    System.out.println("The occurence count of the largest number is: " + count);
    System.out.println(" ");

    }
}