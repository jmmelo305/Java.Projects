/*
 * Program made to calculate ticcket pricing for 3 customers based on their ages and adds a processing fee to it's subtotal cost.
 * Jose Melo
 * 9/8/25
 * CSC 120
 */

//Importing Scanner to be able to ask for inputs.
import java.util.Scanner;
public class MeloLab1Project {
    public static void main (String [] args){
        
        //Declaring variables
        String name1;
        String name2;
        String name3;
        int age1;
        int age2;
        int age3;
        int ticketPrice = 0;
        int ticketPrice2 = 0;
        int ticketPrice3 = 0;
        double processingFee = 0.05;
        double subtotalPrice = 0.0;
        double totalPrice = 0.0;

        //Requests for inputs and organizes into their corresponding variables.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Last Name of Customer 1: ");
        name1 = input.next();

        System.out.println("Enter Age of Customer 1: ");
        age1 = input.nextInt();

        System.out.println("Enter Last Name of Customer 2: ");
        name2 = input.next();

        System.out.println("Enter Age of Customer 2: ");
        age2 = input.nextInt();

        System.out.println("Enter Last Name of Customer 3: ");
        name3 = input.next();

        System.out.println("Enter Age of Customer 3: ");
        age3 = input.nextInt();
        

        //Calculates ticket price based off age for customer 1
        if (age1 > 0 && age1 <= 5){
            ticketPrice = 0;
        }
        
        else if (age1 >= 6 && age1 <= 12){
            ticketPrice = 5;
        }

        else if (age1 >= 13 && age1 <= 17){
            ticketPrice = 8;
        }
        
        else if (age1 >=18 && age1 <= 59){
            ticketPrice = 12;
        }
        
        else if (age1 >= 60){
            ticketPrice = 6;
        }

        //Calculates ticket price based off age for customer 2
         if (age2 > 0 && age2 <= 5){
            ticketPrice2 = 0;
        }
        
        else if (age2 >= 6 && age2 <= 12){
            ticketPrice2 = 5;
        }

        else if (age2 >= 13 && age2 <= 17){
            ticketPrice2 = 8;
        }
        
        else if (age2 >=18 && age2 <= 59){
            ticketPrice2 = 12;
        }
        
        else if (age2 >= 60){
            ticketPrice2 = 6;
        }

        //Calculates ticket price based off age for customer 3
         if (age3 > 0 && age3 <= 5){
            ticketPrice3 = 0;
        }
        
        else if (age3 >= 6 && age3 <= 12){
            ticketPrice3 = 5;
        }

        else if (age3 >= 13 && age3 <= 17){
            ticketPrice3 = 8;
        }
        
        else if (age3 >=18 && age3 <= 59){
            ticketPrice3 = 12;
        }
        
        else if (age3 >= 60){
            ticketPrice3 = 6;
        }

        //Calculates subtotal Price and then adds a processing fee of 5% to it and calculates the total price.

        subtotalPrice = ticketPrice + ticketPrice2 + ticketPrice3;
        totalPrice = (subtotalPrice * processingFee) + subtotalPrice;

        //Print out results per customer
        System.out.println(" ");
        System.out.println("Customer 1 Name: " + name1);
        System.out.println("Customer 1 Age " + age1);
        System.out.println("Customer 1 Ticket Price $" + ticketPrice);
        System.out.println(" ");
    
        System.out.println("Customer 2 Name: " + name2);
        System.out.println("Customer 2 Age " + age2);
        System.out.println("Customer 2 Ticket Price $" + ticketPrice2);
        System.out.println(" ");

        System.out.println("Customer 3 Name: " + name3);
        System.out.println("Customer 3 Age " + age3);
        System.out.println("Customer 3 Ticket Price $" + ticketPrice3);
        System.out.println(" ");

        //Prints final calculations, including subtotal price and total price with processing fee included.
        System.out.println("__________ Calculations __________");
        System.out.println("Subtotal: $" + subtotalPrice);
        System.out.println("Total Charge: $" + totalPrice);
        System.out.println(" ");


    }
}
