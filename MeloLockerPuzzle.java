/*
 * Programmer: Jose Melo
 * Program: Locker Puzzle
 * Purpose:
 * Date: 9/24/2025
 */

//Set up Public Class
public class MeloLockerPuzzle {
    //Set up main method
    public static void main(String[] args) {

        //Declare Variables
        boolean[] lockers;
        int student;
        int locker;
        int i;

        //Create Array with index from 1 to 100
        lockers = new boolean[101];

        //Start with student 1
        student = 1;

        //While loop to run through the logic of the problem
        while (student <= 100) {
            locker = student;
            while (locker <= 100) {
                lockers[locker] = !lockers[locker];
                locker += student;
            }
            student++;
        }

        //Print out statement 
        System.out.println("Lockers open after all students have toggled:");
        
        //While loop to print out the numbers based of the lockers array and assign a new number to variable i
        i = 1;
        while (i <= 100) {
            if (lockers[i]) {
                System.out.println("Locker " + i + " is open ");
            }
            i++;
        }
    }
}