import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Exercise 1: Write 100 random integers to a text file
 * 
 * Requirements:
 * - Create a file named Exercise17_01.txt if it does not exist
 * - If the file already exists, APPEND new data (don't overwrite)
 * - Write 100 integers created randomly (use Math.random())
 * - Integers should be separated by a space
 * - Use text I/O (PrintWriter)
 * 
 * @author Melo
 * Program: Create 100 random integers to a .txt file
 * Date: 1/12/2026
 */
public class MeloExercise17_01 {

    public static void main(String[] args) throws IOException {

        // Step 1: Create the file object
        File file = new File("Exercise17_01.txt");

        // Step 2: Create PrintWriter (append mode)
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter output = new PrintWriter(fileWriter);

        // Step 3: Write 100 random integers to the file
        for (int i = 0; i < 100; i++) {
            int randomNumber = (int)(Math.random() * 100);
            output.print(randomNumber + " ");
        }

        // Step 4: Close the file
        output.close();

        System.out.println("100 random integers written to Exercise17_01.txt");
    }
}
