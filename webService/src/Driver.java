import service.authentication.Authenticator;

import service.flight.FlightService;
import service.itinerary.ItineraryService;
import service.bank.BankService_impl;
import service.booking.Booking_impl;
import javax.xml.ws.Endpoint;
/**
 * Created by Pontus on 2016-02-10.
 */
public class Driver {
    public static void main(String[] args){
        Driver d = new Driver();
    }
    public Driver(){
        Endpoint.publish("http://0.0.0.0:10000/Auth", new Authenticator());
        Endpoint.publish("http://0.0.0.0:10001/Flight", new FlightService());
        Endpoint.publish("http://0.0.0.0:10002/Itinerary", new ItineraryService());
        Endpoint.publish("http://0.0.0.0:10003/Bank", new BankService_impl());
        Endpoint.publish("http://0.0.0.0:10004/Booking", new Booking_impl());

    }
}
