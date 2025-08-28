import java.util.LinkedList;
import java.util.Scanner;
public class MeloCurrencyConverter{
    public static void main(String[] args){
        System.out.println("Welcome to the Currency Converter!");
        System.out.println(" ");
        System.out.println("Please enter a Country");

        LinkedList<String> countries = new LinkedList<>();
        countries.add("Colombia");
        countries.add("Brazil");
        countries.add("Italy");
        countries.add("Japan");
        countries.add("South Korea");
        System.out.println(countries);

        Scanner countryScanner = new Scanner(System.in);
        String country = countryScanner.nextLine();
        System.out.println("Country selected: " + country);

    }   
}