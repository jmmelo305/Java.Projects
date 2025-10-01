/*
 * Programmer: Jose Melo
 * Program: Locate the Largest Element
 * Purpose: The user inputs number of columns and rows in of an array
 * and the elements inside the array and the program outputs where the
 * largest element is located.
 * Date: 10/1/2025
 */

import java.util.Scanner;
public class MeloLargestElement {
    public static void main (String [] args){
    
        int rowNum;
        int colNum;
        int [] [] array;

        System.out.println("Enter the number of rows and columns of the array: ");
        Scanner input = new Scanner(System.in);
        rowNum = input.nextInt();
        colNum = input.nextInt();
        
        System.out.println();
        System.out.println("Enter the array: ");
        
        
        array = new int [rowNum][colNum];
        for (int i = 0; i < rowNum; i++){
            for (int j = 0; j < colNum; j++){
                array[i][j] = input.nextInt();
            }
        }
        
        input.close();
        

        
       /* 
        array = new int[rowNum][colNum];
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                array[i][j] = input.nextInt();
            }
        }
        */

        
    }
/*
    public static int [] locateLargest (double [] [] a){
        int [] singleArray;
        return singleArray;
    }
        */
}
