/*
Quadratic Formula calculator

A program that one inputs "a" "b" and "c" numbers and calculates the roots of the quadratic equation with inputted numbers

8/26/2025

Jose Melo

*/

//Imports

import java.util.Scanner;
public class MeloQuadraticForm {
    public static void main (String [] args){
        
        
        //Asking for input and assigning it to variables
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter a, b, c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        
        //Square root command, found on w3schools, cleaned up
	//double square_root = Math.pow((Math.pow(b,2) - 4 * a * c),0.5);
        double square_root = Math.sqrt(Math.pow(b,2) - (4 * a * c));
        
        
        //Creating both equations.
        double r1 = ((-b + square_root) / (2 * a));
        double r2 = ((-b - square_root) / (2 * a));
        
        
        //Formatting Decimals found on w3schools.
        String result1 = String.format ("%.6f",r1);
        String result2 = String.format ("%.6f",r2);
         

        //If, else if, else statements to determine if square_root is positive, negative, or 0. Print statement at each
        if (square_root > 0.0){
            System.out.println("The roots are " + result1 + " and " + result2);
        }
        else if (square_root == 0){
            System.out.println("The root is " + result1);
        }    
        else{
            System.out.println("The equation has no real roots");
        }  
    }
}
