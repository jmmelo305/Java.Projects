import java.util.Scanner;

public class MeloPhoneKeypad {
    public static void main (String [] args){
        System.out.println("Please enter a letter to be converted into a number");
        Scanner input = new Scanner(System.in);
        String letter = input.nextLine().toUpperCase();
        
        System.out.println(" ");
        System.out.println("The letter you chose was: " + letter);
        
        if (letter.equals ("A") || letter.equals ("B") || letter.equals ("C")){
            System.out.println("Your Corresponding Number to the letter: " + letter + " is 2");
        }

        else if (letter.equals("D") || letter.equals("E") || letter.equals("F")){
            System.out.println ("Your Corresponding Number to the letter: " + letter + " is 3");
        }
        
        else if (letter.equals("G") || letter.equals("H") || letter.equals("I")){
            System.out.println ("Your Corresponding Number to the letter: " + letter + " is 4");
        }
        
        else if (letter.equals("J") || letter.equals("K") || letter.equals("LL")){
            System.out.println ("Your Corresponding Number to the letter: " + letter + " is 5");
        }

        else if (letter.equals("M") || letter.equals("N") || letter.equals("O")){
            System.out.println ("Your Corresponding Number to the letter: " + letter + " is 6");
        }

        else if (letter.equals("P") || letter.equals("Q") || letter.equals("R") || letter.equals("S")){
            System.out.println ("Your Corresponding Number to the letter: " + letter + " is 7");
        }

        else if (letter.equals("T") || letter.equals("U") || letter.equals("V")){
            System.out.println ("Your Corresponding Number to the letter: " + letter + " is 8");
        }

        else if (letter.equals("W") || letter.equals("X") || letter.equals("Y") || letter.equals("Z")){
            System.out.println ("Your Corresponding Number to the letter: " + letter + " is 9");
        }
        
        else {
            System.out.println("Re - Run Program and Try again");
        }
    }
}