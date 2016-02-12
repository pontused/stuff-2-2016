package service.itinerary;

import java.util.*;
import service.itinerary.com.Flight.*;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Created by Pontus on 2016-02-12.
 */
public class FlightTree {

    Date time;
    String name;
    int depth;
    List<FlightNode> lFlight = new ArrayList<FlightNode>();
    public FlightTree(String departureCity, Date t, int i){
        this.name = departureCity;
        this.time = t;
        this.depth = i;
        try {
            FlightService port = (new FlightService_Service()).getFlightPort();

            GregorianCalendar c = new GregorianCalendar();
            c.setTime(this.time);
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

            ArrayList<Flight> li = (ArrayList<Flight>)port.getFlights(this.name,date2);
            for (Flight ft:li) {
                lFlight.add(new FlightNode(ft.getDestinationCity(), ft, depth-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<List<Flight>> getItinerary(String destinationCity){
        ArrayList<List<Flight>> itinerary = new ArrayList<>();
        itinerary.add(new ArrayList<Flight>());
        return getItineraryAcumulator(destinationCity, new ArrayList<Flight>(), itinerary);
    }

    public List<List<Flight>> getItineraryAcumulator(String destinationCity,ArrayList<Flight> path,List<List<Flight>> itinerary ){
        if(destinationCity.equals(this.name)){
            //path.add(flight);
        }else{
            //path.add(flight);
            for (FlightNode fn:lFlight) {
                fn.getItineraryAcumulator(destinationCity, new ArrayList(path), itinerary);

            }
        }
        return itinerary;
    }

    public class FlightNode{
        Flight flight;
        String name;
        int depth;
        List<FlightNode> lFlight = new ArrayList<FlightNode>();
        public FlightNode(String departureCity, Flight f, int i){
            this.name = departureCity;
            this.flight = f;
            this.depth = i;
            try {
                FlightService port = (new FlightService_Service()).getFlightPort();
                ArrayList<Flight> li = (ArrayList<Flight>)port.getFlights(this.name,flight.getArrivalDate());
                for (Flight ft:li) {
                    lFlight.add(new FlightNode(ft.getDestinationCity(),ft,depth-1));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public List<List<Flight>> getItineraryAcumulator(String destinationCity,ArrayList<Flight> path,List<List<Flight>> itinerary ){
            if(destinationCity.equals(this.name)){
                path.add(flight);
            }else{
                path.add(flight);
                for (FlightNode fn:lFlight) {
                    fn.getItineraryAcumulator(destinationCity, new ArrayList(path), itinerary);

                }
            }
            return itinerary;
        }
    }

}
