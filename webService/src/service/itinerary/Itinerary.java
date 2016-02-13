package service.itinerary;

import java.util.ArrayList;
import service.itinerary.com.Flight.*;
/**
 * Created by peter on 2/1/16.
 */
public class Itinerary {


    public final int id;
    public final String departureCity;
    public final String destinationCity;
    public final boolean isDirectFlight;
    public ArrayList<Flight> flightList = new ArrayList<Flight>();

    private boolean routeExists;

    public Itinerary(String departureCity, String destinationCity, int id) {
        this.id = id;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.isDirectFlight = isDirectFlight();
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setFlight(Flight flight){
        flightList.add(flight);
    }
    public ArrayList<Flight> getFlightList(){
        return flightList;
    }

    private boolean isDirectFlight(){
        return flightList != null && flightList.size() == 1 &&
                flightList.get(0).getDepartureCity().equals(departureCity) &&
                flightList.get(0).getDestinationCity().equals(destinationCity);
    }
    public int getId(){
        return this.id;
    }
}
