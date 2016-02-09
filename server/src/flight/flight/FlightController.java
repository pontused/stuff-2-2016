package flight.flight;

import flight.authentication.User;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by peter on 2/8/16.
 */
public class FlightController {


    private static ArrayList<Flight> flightDB = new ArrayList<Flight>();


    private ArrayList<Flight> flights;

    public FlightController(){

    }
    private void genFlights(){

        flightDB.add(new Flight("SAS","Stockholm","Dublin",2000));

    }
    public ArrayList<Flight> getFlights(){
        return flightDB;
    }

    public Flight getFlightByID(int id){
        for (Flight flight : flightDB){
            if (flight.flightID == id){
                return flight;
            }
        }
        return null;
    }


}
