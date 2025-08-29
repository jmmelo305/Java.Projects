import java.util.Collections;
import java.util.LinkedList;
public class MeloCurrencyConverter{
    public static void main(String[] args){
        LinkedList<String> countries = new LinkedList<>();
        countries.add("Colombia");
        countries.add("Brazil");
        countries.add("Italy");
        countries.add("Japan");
        countries.add("South Korea");
        Collections.sort(countries);
        System.out.println(countries);

        int randNum = (int)(Math.random()*5);

        String country1 = countries.get(randNum);
        System.out.println(country1);
        System.out.println("Random Generated Num is: " + randNum);
    }   
}
