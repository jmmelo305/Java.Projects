/*
 * Programmer: Jose Melo
 * Program: Locate the Largest Element
 * Purpose: The user inputs number of columns and rows in of an array
 * and the elements inside the array and the program outputs where the
 * largest element is located.
 * Date: 10/1/2025
 */


//Import Scanner
import java.util.Scanner;
public class MeloLargestElement {

    //Create Main Method
    public static void main (String [] args){
        
        //Declare Variables and Arrays in Main Method.
        int rowNum;
        int colNum;
        double [] [] array;
        int [] location;


        //Prompt User for input.
        System.out.println("Enter the number of rows and columns of the array: ");
        Scanner input = new Scanner(System.in);
        rowNum = input.nextInt();
        colNum = input.nextInt();
        
        //Apply Newly inputted data into the array
        array = new double [rowNum][colNum];
        
        System.out.println();

        //Prompt User to input the information for the array.
        System.out.println("Enter the array: ");
        for (int i = 0; i < rowNum; i++){
            for (int j = 0; j < colNum; j++){
                array[i][j] = input.nextDouble();
            }
        }

        //Pull locateLargest Method and print results
        location = locateLargest (array);
        System.out.println();
        System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");
        
        
        input.close();      
    }    
            
    //locateLargest Method: Used to find what number is the largest in the array and where it is located.      
    public static int [] locateLargest (double [] [] a){
        int [] location = new int [2];
        double element = a[0][0];      
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > element) {
                    element = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }
}
