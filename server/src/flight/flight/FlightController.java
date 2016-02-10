package flight.flight;

import flight.authentication.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by peter on 2/8/16.
 */
public class FlightController {


    private static HashMap<Flight,ArrayList<Passanger>> flightDB = new HashMap<Flight, ArrayList<Passanger>>();


    private ArrayList<Flight> flights;

    public FlightController(){

    }
    private void genFlights(){

        flightDB.put(new Flight("SAS","Stockholm","Dublin",2000),new ArrayList<Passanger>());

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

    public Set<Flight> getFlights(){
        return flightDB.keySet();
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
