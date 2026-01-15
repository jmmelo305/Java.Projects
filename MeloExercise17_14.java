/*
Programmer: Melo
Program: Exercise17_14
Purpose: Create a program to decode an encrypted file.
Date: 1/14/2026
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MeloExercise17_14 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        // Prompt user for encrypted file name
        System.out.print("Enter the encrypted file name: ");
        String encryptedFile = input.nextLine();

        // Prompts user for output file name
        System.out.print("Enter the output file name: ");
        String outputFile = input.nextLine();

        // Create file streams
        FileInputStream inputStream = new FileInputStream(encryptedFile);
        FileOutputStream outputStream = new FileOutputStream(outputFile);

        int value;
        while ((value = inputStream.read()) != -1) {
            // Decode by subtracting 5
            outputStream.write(value - 5);
        }

        // Close streams
        inputStream.close();
        outputStream.close();

        System.out.println("File decoded successfully!");
        input.close();
    }
}
