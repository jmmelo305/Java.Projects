import java.io.*;
import java.util.Date;

/**
 * Exercise 2: Write and read binary data
 * 
 * Requirements:
 * Part 1 - WRITE:
 * - Store an array of five int values: 1, 2, 3, 4, 5
 * - Store a Date object for the current time
 * - Store the double value 5.5
 * - Write all to file named Exercise17_02.dat
 * 
 * Part 2 - READ:
 * - In the same program, read the data back
 * - Display all values to verify they were stored correctly
 * 
 * @author Melo
 * 
 * Programmer: Melo
 * Program: Exercise 2 Chapter 17
 * Purpose: Create a program that stores an array of the five int values (1,2,3,4,5), a Date object for the current time, and the double value 5.5 into a file named MeloExercise17_02.dat
 * Date: 1/13/2026
 */
public class MeloExercise17_02 {
    
    public static void main(String[] args) throws IOException {
        
        // Data to write
        int[] numbers = {1, 2, 3, 4, 5};
        Date currentTime = new Date();
        double value = 5.5;
        
        // PART 1: WRITE DATA
        // TODO: Create DataOutputStream for "Exercise17_02.dat"
        
        FileOutputStream fileOut = new FileOutputStream("MeloExercise17_02.dat");
        DataOutputStream output = new DataOutputStream (fileOut);

        // TODO: Write the array of integers
        // Hint: Loop through the array and use writeInt() for each element
        
        for (int i = 0; i < numbers.length; i++){
            output.writeInt(numbers[i]);
        }
        
        // TODO: Write the Date object
        // Hint: Use writeLong() to write currentTime.getTime()

        output.writeLong(currentTime.getTime());
        
        
        // TODO: Write the double value

        output.writeDouble(value);
        
        
        // TODO: Close the output stream (or use try-with-resources)
        
        output.close();
        
        System.out.println("Data written to Exercise17_02.dat");
        
        
        // PART 2: READ DATA
        // TODO: Create DataInputStream for "Exercise17_02.dat"

        FileInputStream fileIn = new FileInputStream ("MeloExercise17_02.dat");
        DataInputStream input = new DataInputStream(fileIn);
        
        // TODO: Read the array of integers
        // Hint: Create a new array and use readInt() five times
        
        int [] readNumbers = new int[5];
        for (int i = 0; i < readNumbers.length; i++){
            readNumbers[i] = input.readInt();
        }
        
        // TODO: Read the Date object
        // Hint: Use readLong() and create new Date with that value

        long time = input.readLong();
        Date readDate = new Date (time);
        
        // TODO: Read the double value
        
        double readValue = input.readDouble();
        
        // TODO: Close the input stream (or use try-with-resources)
        
        input.close();
        
        // TODO: Display all the data you read
        System.out.println("\nData read from Exercise17_02.dat:");
        // Display array, date, and double value
        
        System.out.print("Integers: ");
        for (int i = 0; i < readNumbers.length; i++){
            System.out.println(readNumbers[i] + " ");
        }

        System.out.println("\nDate: " + readDate);
        System.out.println("Double Value: " + readValue);
    }
}