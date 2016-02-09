package flight.itinerary;

import flight.DataControllerHandler;
import flight.authentication.FlightAuthenticator;
import flight.authentication.UserController;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by peter on 2/1/16.
 */


@WebService(serviceName = "ItineraryService", portName = "ItineraryPort", targetNamespace = "http://www.itineraryservice.com")

public class ItineraryService {

    private UserController userController = DataControllerHandler.getUserController();

    @WebMethod(operationName = "getItinerary")
    public void getItinerary(@WebParam (name = "departureCity") String departureCity, @WebParam (name = "destinationCity") String destinationCity ) {



        //Itinerary itinerary = new Itinerary(departureCity,destinationCity);


    }
    @WebMethod(operationName = "checkAvailability")
    public void checkAvailability(@WebParam (name = "departureCity") String departureCity, @WebParam (name = "destinationCity") String destinationCity ) {


        FlightAuthenticator authenticator = new FlightAuthenticator();
        authenticator.validateTicket("peter",123);
        //Authenticator_Service authenticator_service = new Authenticator_Service();
        //Authenticator authenticator = authenticator_service.getAuthenticatorPort();
        Itinerary itinerary = new Itinerary(departureCity,destinationCity);


    }



}
/*
@WebService(serviceName = "itinerary")
@HandlerChain(file = "handler-chain.xml")
public class itinerary {


@WebMethod(operationName = "getItinerary")
public ArrayList<FlightsList> getItinerary(@WebParam(name = "from") String from, @WebParam(name = "to") String to, @WebParam(name = "tokenid") String tokenid) throws AuthenticationException {

    if(!Authenticator.Autheticate(tokenid)){
        throw new AuthenticationException();
    }


    ArrayList<FlightsList> listOfLinks = Flight.getDirectFlights(from, to);
    if (listOfLinks.isEmpty()) {
        listOfLinks = Flight.getIndirectFlights(from, to);
    }
        /*
         if(listOfLinks.isEmpty()){
         listOfLinks = new ArrayList<FlightsList>();
         }
         */
/*
    return listOfLinks;
}
}
 */