/*

Helping Jess out with an assignment for Mccuen, I made my own code

Jose Melo

8/28/2025
*/

import java.util.Scanner;
public class MeloAverageTestCalc{
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first test score: ");
        int grade1 = input.nextInt();
        
        System.out.println("Enter second test score: ");
        int grade2 = input.nextInt();
        
        System.out.println("Enter third test score");
        int grade3 = input.nextInt();
        
        double math = ((grade1 + grade2 + grade3) / 3);
        System.out.println("Your average is: "+ math);
        
        if (math >= 90){
            String letterGrade = "A";
            System.out.println("Your letter grade is: " + letterGrade);
        }
        else if (math >= 80 && math < 90){  String letterGrade = "B";
            System.out.println("Your letter grade is: " + letterGrade);
        }
        else if (math >= 70 && math < 80){
            String letterGrade = "C";
            System.out.println("Your letter grade is: " + letterGrade);
        }
        else if (math >= 60 && math < 70){
            String letterGrade = "D";
            System.out.println("Your letter grade is: " + letterGrade);
        }
        else{
            String letterGrade = "F";
            System.out.println("Your letter grade is: " + letterGrade);
        }
    }

}
