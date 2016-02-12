package service.flight;

import service.authentication.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by peter on 2/8/16.
 */
public class FlightController {


    private static HashMap<Flight,ArrayList<Passanger>> flightDB = new HashMap<Flight, ArrayList<Passanger>>();


    private ArrayList<Flight> flights;

    public FlightController(){
        if (flightDB.size() == 0)
            genFlights();
    }
    private void genFlights(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm");

        try{
            flightDB.put(new Flight("SAS","Stockholm","Dublin",2000,format.parse("12-03-2015 15:30"),format.parse("12-03-2015 16:30")),new ArrayList<Passanger>());
            flightDB.put(new Flight("SAS","Stockholm","Cork",1500,format.parse("12-03-2015 12:23"),format.parse("12-03-2015 13:44")),new ArrayList<Passanger>());
            flightDB.put(new Flight("SAS","Stockholm","Singapore",3000,format.parse("12-03-2015 10:40"),format.parse("12-03-2015 12:04")),new ArrayList<Passanger>());
            flightDB.put(new Flight("Aerlingus","Cork","Singapore",1500,format.parse("12-03-2015 12:23"),format.parse("12-03-2015 13:44")),new ArrayList<Passanger>());
            flightDB.put(new Flight("Aerlingus","Galway","New york",3500,format.parse("12-03-2015 11:23"),format.parse("12-03-2015 17:44")),new ArrayList<Passanger>());
            flightDB.put(new Flight("Ryan Air","Dublin","Galway",500,format.parse("12-03-2015 13:23"),format.parse("12-03-2015 14:44")),new ArrayList<Passanger>());
            flightDB.put(new Flight("Ryan Air","Cork","Galway",300,format.parse("12-03-2015 10:32"),format.parse("12-03-2015 12:00")),new ArrayList<Passanger>());
            flightDB.put(new Flight("Ryan Air","Galway","Cork",300,format.parse("12-03-2015 12:23"),format.parse("12-03-2015 13:44")),new ArrayList<Passanger>());


        }catch (ParseException e){
            System.out.println("Bad time format ");
        }

    }
    private void addPassager(int flightNumber, Passanger passanger){
        for (Flight f : flightDB.keySet()){
            if (f.flightID == flightNumber){
                f.decreaseAvailableSeats();
                flightDB.get(f).add(passanger);
            }
        }
    }
    protected void bookFlight(int flightNumber,Passanger passanger){
        addPassager(flightNumber,passanger);
    }

    public ArrayList<Flight> getFlights(String departureCity, Date departureTime) throws ParseException{

        ArrayList<Flight> flights = new ArrayList<Flight>();

        Date dt = departureTime;


        for (Flight f : flightDB.keySet()){
            if (f.getDepartureCity().equals(departureCity) && f.getDepartureDate().after(dt) ){
                flights.add(f);
            }
        }
        return flights;
    }

    public Flight getFlightByID(int id){
        for (Flight flight : flightDB.keySet()){
            if (flight.flightID == id){
                return flight;
            }
        }
        return null;
    }


}
