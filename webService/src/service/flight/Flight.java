package service.flight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by peter on 2/1/16.
 */
public class Flight {

    public final int flightID;
    public final String airline;
    public final String departureCity;
    public final String destinationCity;
    public float price;
    public int availableSeats;
    public Date departureDate;
    public Date arrivalDate;

    public Flight(String airline, String departureCity, String destinationCity, float price, String departureDate,String arrivalDate ) throws  ParseException{
        this.airline = airline;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.price = price;
        this.availableSeats = 250;

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        this.departureDate = format.parse(departureDate);
        this.arrivalDate = format.parse(arrivalDate);
        this.flightID = genFlightID();

    }

    private int genFlightID(){
        return (destinationCity+departureDate+airline).hashCode();
    }

    public void decreaseAvailableSeats(){
        availableSeats -= 1;
    }
    public String getAirline() {
        return airline;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }
    public float getPrice() {
        return price;
    }

    public int getFlightID() {
        return flightID;
    }


    public Date getDepartureDate() {
        return departureDate;
    }


}
