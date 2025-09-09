/*

Made it to practice n learn to code different statements or assignments or wtv

Jose Melo

8/28/25
*/

//Imports Lists, Collections (to sort lists), and Scanner
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
public class MeloCurrencyConverter{
    public static void main(String[] args){

        //List systems. 
        LinkedList<String> countries = new LinkedList<>();
        countries.add("COP");
        countries.add("BRL");
        countries.add("EURO");
        countries.add("YEN");
        countries.add("WON");
        Collections.sort(countries);
        System.out.println("Countries Available for Currency Converter: " + countries);
        System.out.println(" ");


        //Map Systems, .put / .get / .remove
        Map<String, Double> d = new HashMap<>();
        d.put("WON", 1385.99);
        d.put("COP", 3940.00);
        d.put("YEN", 147.38);
        d.put("EURO", 0.85);
        d.put("BRL", 5.42);

        Scanner input = new Scanner(System.in);
        System.out.println("Out of the list provided please choose a currency: ");
        String currencyCountry = input.nextLine();
        System.out.println(" ");
        System.out.println("Enter the monetary value for the currency: ");
        double currencyAmount = input.nextDouble();
        input.close();
        System.out.println(" ");

        double calculation = currencyAmount * d.get(currencyCountry);
        
        System.out.println("The currency you chose was: " + currencyCountry);
        System.out.println(" ");
        System.out.println("The conversion as of September 8, 2025 at 9:30pm EST is $" + d.get(currencyCountry));
        System.out.println(" ");
        System.out.println("Conversion Complete. . .");
        System.out.println(" ");
        System.out.println("$" + calculation + " " + currencyCountry);
        System.out.println(" ");
       
    }   
}

