import javax.jws.WebService;
import javax.jws.WebMethod;

import java.util.ArrayList;
/**
 * Created by Pontus on 2016-02-10.
 */
@WebService(targetNamespace = "my.webservice.com")
public class FlightHandler {
    ArrayList<Flight> flightlist;
    public FlightHandler(){
        flightlist = new ArrayList<Flight>();
        flightlist.add(new Flight("1", "Stockholm", "Kopenhagen", "100", "5", "6"));
        flightlist.add(new Flight("2", "Kopenhagen", "Paris", "120", "7", "8"));
    }
    @WebMethod
    public ArrayList<String> getFlightsDepartures(String name){
        ArrayList<String> li = new ArrayList<String>();
        for (Flight f:flightlist) {
            if(f.getDeparture().equals(name)){
                li.add(f.getId());
            }
        }
        //return a list of flight ids
        return li;
    }

    @WebMethod
    public ArrayList<String> getFlightsDestination(String name){
        ArrayList<String> li = new ArrayList<String>();
        for (Flight f:flightlist) {
            if(f.getDestination().equals(name)){
                li.add(f.getId());
            }
        }
        //return a list of flight ids
        return li;
    }

    @WebMethod
    public ArrayList<String> getFlight(String id){
        ArrayList<String> li = new ArrayList<String>();
        for (Flight f:flightlist) {
            if(f.getId().equals(id)){
                li.add(f.getId());
                li.add(f.getDeparture());
                li.add(f.getDestination());
                li.add(f.getPrice());
                li.add(f.getDepartureTime());
                li.add(f.getArivalTime());
            }
        }
        //return a list of flight ids
        return li;
    }

    public class Flight{
        String id, departure, destination;
        String price,departureTime,arivalTime;
        public Flight(String id,  String departure, String destination, String price, String departureTime,String arivalTime){
            this.id = id;
            this.departure = departure;
            this.destination = destination;
            this.price = price;
            this.departureTime = departureTime;
            this.arivalTime = arivalTime;
        }
        public String getDeparture(){
            return this.departure;
        }
        public String getDestination(){
            return this.destination;
        }
        public String getId(){
            return this.id;
        }
        public String getPrice(){
            return this.price;
        }
        public String getDepartureTime(){
            return this.departureTime;
        }
        public String getArivalTime(){
            return this.arivalTime;
        }
    }
}