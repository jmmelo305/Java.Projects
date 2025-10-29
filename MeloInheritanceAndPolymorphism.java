/*
 * Programmer: Jose Melo
 * Program: Chapter 11 Inheritance And Polymorphism
 * Purpose: A program 
 * Date: 10/28/2025
 */
import java.util.*;

//Create Flight Class
class Flight {
    private String flightNo;
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;

    // Constructor
    public Flight(String flightNo, GregorianCalendar departureTime, GregorianCalendar arrivalTime) {
        this.flightNo = flightNo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    //Method used to get the flight number
    public String getFlightNo() {
        return flightNo;
    }

    //Method used to get the departure time
    public GregorianCalendar getDepartureTime() {
        return departureTime;
    }
    //Method used to set the departure time
    public void setDepartureTime(GregorianCalendar departureTime) {
        this.departureTime = departureTime;
    }

    //Method used to get the arrival time
    public GregorianCalendar getArrivalTime() {
        return arrivalTime;
    }
    //Method used to set the arrival time
    public void setArrivalTime(GregorianCalendar arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    // Method to get flight time in minutes
    public long getFlightTime() {
        long diffMillis = arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis();
        return diffMillis / (60 * 1000); // convert milliseconds to minutes
    }
}

//Create Itinerary class
class Itinerary {
    private List<Flight> flights;
    
    //Constructor
    public Itinerary(List<Flight> flights) {
        // Make sure flights are sorted by departure time
        this.flights = new ArrayList<>(flights);
        this.flights.sort(Comparator.comparing(Flight::getDepartureTime));
    }

    //Method to get total travel time in minutes
    public long getTotalTravelTime() {
        if (flights.isEmpty()) return 0;
        GregorianCalendar start = flights.get(0).getDepartureTime();
        GregorianCalendar end = flights.get(flights.size() - 1).getArrivalTime();
        long diffMillis = end.getTimeInMillis() - start.getTimeInMillis();
        return diffMillis / (60 * 1000);
    }

    //Method to get total flight time in minutes - adding all the flight times together
    public long getTotalFlightTime() {
        long total = 0;
        for (Flight f : flights) {
            total += f.getFlightTime();
        }
        return total;
    }
}

//Tester Provided
public class MeloInheritanceAndPolymorphism {
    public static void main(String[] args) {

   List<Flight> flights = new ArrayList<>();

   flights.add(new Flight("US230", 

       new GregorianCalendar(2014, 4, 5, 5, 5, 0),

       new GregorianCalendar(2014, 4, 5, 6, 15, 0)));

   flights.add(new Flight("US235", 

       new GregorianCalendar(2014, 4, 5, 6, 55, 0),

       new GregorianCalendar(2014, 4, 5, 7, 45, 0)));

   flights.add(new Flight("US237", 

       new GregorianCalendar(2014, 4, 5, 9, 35, 0),

       new GregorianCalendar(2014, 4, 5, 12, 55, 0)));

   

   Itinerary itinerary = new Itinerary(flights);

   System.out.println(itinerary.getTotalTravelTime());

   System.out.println(itinerary.getTotalFlightTime());

 }


}
