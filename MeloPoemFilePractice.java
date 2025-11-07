/*
 * Programmer: Jose Melo
 * Program: Chapter 12 Practice Text I/O
 * Purpose: This program will count the number of characters, words, and lines in a set file.
 * Date: 11-6-2025
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MeloPoemFilePractice {
    public static void main (String [] args){
        int numChar = 0;
        int numWords = 0;
        int numLines = 0;
        String line;

        try{
            File file = new File ("C:\\Users\\JoseMelo_Student-Wak\\OneDrive - Wake County Public Schools\\Documents\\GitHub\\Java.Projects\\Referecing Files\\poem.txt");
            Scanner input = new Scanner(file);

            

            while (input.hasNextLine()) {
                line = input.nextLine();
                numLines ++;
                
                numChar += line.length();

                String [] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()){
                    numWords += words.length;
                }
            }
            
            System.out.println("File " + file + " has: ");
            System.out.println(numChar + " characters");
            System.out.println(numWords + " words");
            System.out.println(numLines + " lines");
        }

        catch (FileNotFoundException e){
            System.out.println("File not found!");
        }

        catch (Exception e){
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
