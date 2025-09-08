import java.util.Scanner;

public class MeloLab1Project {
    public static void main (String [] args){
        
        String name1;
        String name2;
        String name3;
        String ticketType = " ";
        String ticketType2 = " ";
        String ticketType3 = " ";
        int age1;
        int age2;
        int age3;
        int ticketPrice = 0;
        int ticketPrice2 = 0;
        int ticketPrice3 = 0;

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
        

        //Calculate ticket price based off age.
        if (age1 > 0 && age1 <= 5){
            ticketType = "Free";
            ticketPrice = 0;
        }
        
        else if (age1 >= 6 && age1 <= 12){
            ticketType = "Child ticket";
            ticketPrice = 5;
        }

        else if (age1 >= 13 && age1 <= 17){
            ticketType = "Teen Ticket";
            ticketPrice = 8;
        }
        
        else if (age1 >=18 && age1 <= 59){
            ticketType = "Adult Ticket";
            ticketPrice = 12;
        }
        
        else if (age1 >= 60){
            ticketType = "Senior Ticket";
            ticketPrice = 6;
        }

         if (age2 > 0 && age2 <= 5){
            ticketType2 = "Free";
            ticketPrice2 = 0;
        }
        
        else if (age2 >= 6 && age2 <= 12){
            ticketType2 = "Child ticket";
            ticketPrice2 = 5;
        }

        else if (age2 >= 13 && age2 <= 17){
            ticketType2 = "Teen Ticket";
            ticketPrice2 = 8;
        }
        
        else if (age2 >=18 && age2 <= 59){
            ticketType2 = "Adult Ticket";
            ticketPrice2 = 12;
        }
        
        else if (age2 >= 60){
            ticketType2 = "Senior Ticket";
            ticketPrice2 = 6;
        }


         if (age3 > 0 && age3 <= 5){
            ticketType = "Free";
            ticketPrice = 0;
        }
        
        else if (age3 >= 6 && age3 <= 12){
            ticketType = "Child ticket";
            ticketPrice = 5;
        }

        else if (age3 >= 13 && age3 <= 17){
            ticketType = "Teen Ticket";
            ticketPrice = 8;
        }
        
        else if (age3 >=18 && age3 <= 59){
            ticketType = "Adult Ticket";
            ticketPrice = 12;
        }
        
        else if (age3 >= 60){
            ticketType = "Senior Ticket";
            ticketPrice = 6;
        }

        


        System.out.println("This is the ticket type for customer 1 " + ticketType + " and the ticket price $" + ticketPrice);
        System.out.println(" ");

        System.out.println("This is the ticket type for customer 2 " + ticketType2 + " and the ticket price $" + ticketPrice2);
        System.out.println(" ");

        System.out.println("This is the ticket type for customer 3 " + ticketType + " and the ticket price $" + ticketPrice);
        System.out.println(" ");

        // Add a 5% processing fee to the subtotal to get the total charge

        //Print out results ADD THE TICKET PRICE PER PERSON
        System.out.println("Customer 1 Name: " + name1);
        System.out.println("Customer 1 Age " + age1);
        System.out.println(" ");
    
        System.out.println("Customer 2 Name: " + name2);
        System.out.println("Customer 2 Age " + age2);
        System.out.println(" ");

        System.out.println("Customer 3 Name: " + name3);
        System.out.println("Customer 3 Age " + age3);
        System.out.println(" ");


        //Final Calculations, add and print subtotal, print total charge after the 5% processing fee.



    }
}