/*
 * Programmer: Jose Melo
 * Program: Processing Scores in a Text File on the Web
 * Purpose: Create a program that grabs scores from a url text file 
 *          and then process them to find the total and average scores.
 * Date: 11/13/2025
 */


//A lot of comments were added because I made sure I understood the program 


// Import Java APIs necessary for the program
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URLConnection;

// Create tester Class
public class MeloProcessScoresLink {
    public static void main (String [] args){
        // Hardcode URL link
        String url = "https://liveexample.pearsoncmg.com/data/Scores.txt";
        // Create a variable for the Calculator Class
        ScoreCalculator calculator = new ScoreCalculator();

        System.out.println("Reading data from: " + url);
        // Try & Catch Statements for error handling.
        try {
            calculator.loadFromURL(url);

            System.out.println("Total is " + calculator.getTotal());
            System.out.println("Average is " + calculator.getAverage());           
        }
        // Catches any exception (generic) could be specific if possible
        catch (Exception e) {
            System.err.println("Error loading scores" + e.getMessage());
        }
        

    }
}

// Calculation Class
class ScoreCalculator{

    // Private variables only attainable within this specific class
    private double total;
    private int count;

    // Actual Calculation Method - the "throws Exception" represents the fact that there might be an error and if there is passes it to the Try & Catch block in the Main Method in the Tester
    public void loadFromURL(String urlString) throws Exception{
        // Uniform Resource Identifier - represents a web address in a safe, structured way.
        URI uri;

        // URLConnection - used to connect to a resource so you can read from it.
        URLConnection connection;
        uri = new URI (urlString);

        // Line below basically creates the connection to the url (hardcoded in the Tester Class) and prepares it to read the data from said url.
        connection = uri.toURL().openConnection();
        

        // BufferedReader lets you read text from an input stream efficiently, line by line, rather than reading one character at a time.
        // getInputStream attains the raw code from the URL, InputStreamReader converts it into Characters, BufferedReader reads the lines efficiently
        // Lines above are used to read the actual data from the URL provided.
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))){
            String line;
            
            // reader.readLine() reads one line of text from the BufferedReader at a time, returns a String containing the line if there's text, returns NULL if it reaches the end of the file.
            // Loop continues until there are no more lines
            // By doing (line = ) it automatically assigns that String value to the variable Line
            while ((line = reader.readLine()) != null){

                // line.trim gets rid of any leading and trailing whitespaces from the line
                // .split("\\s+") splits the line into parts where there is one or more whitespace characters
                String [] parts;
                parts = line.trim().split("\\s+");

                // Loops through each element in the Parts Array, assigns the most recently read value to the String Part variable.
                for(String part : parts){
                    // if (!part.isEmpty()) skips empty strings (in english terms its basically says if (NOT part.isEmpty)).
                    if (!part.isEmpty()){
                        // Double.parseDouble(variable_being_converted) converts the String value into the double value. Integer.parseInt(variable_being_converted) essentially does the same but String to Integer.
                        double value = Double.parseDouble(part);
                        total += value;
                        count ++;
                    }
                }
            }
        }
    }

    // Returns Total of Scores
    public double getTotal(){
        return total;
    }
    // Returns Average of Scores
    public double getAverage (){
        return count == 0 ? 0 : total / count;
    }

}
