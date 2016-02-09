package flight.flight;

/**
 * Created by peter on 2/1/16.
 */
public class Flight {

    public final int flightID;
    public final String airline;
    public final String departureCity;
    public final String destinationCity;
    public float price;

    public Flight(String airline, String departureCity, String destinationCity, float price) {
        this.flightID = 1234;
        this.airline = airline;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.price = price;

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


}
