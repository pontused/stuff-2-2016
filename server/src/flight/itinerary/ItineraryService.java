package flight.itinerary;

import flight.DataControllerHandler;
import flight.authentication.Authenticator;
import flight.authentication.FlightAuthenticator;
import flight.authentication.UserController;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

/**
 * Created by peter on 2/1/16.
 */


@WebService(serviceName = "ItineraryService", portName = "ItineraryPort", targetNamespace = "http://www.itineraryservice.com")

public class ItineraryService {

    private Authenticator authenticator = new FlightAuthenticator();

    @Resource
    private WebServiceContext wsc;

    @WebMethod(operationName = "getItinerary")
    public void getItinerary(@WebParam (name = "departureCity") String departureCity, @WebParam (name = "destinationCity") String destinationCity ) {

        if (validateHeader()) {

        }


        //Itinerary itinerary = new Itinerary(departureCity,destinationCity);


    }
    @WebMethod(operationName = "checkAvailability")
    public int checkAvailability(@WebParam (name = "departureCity") String departureCity, @WebParam (name = "destinationCity") String destinationCity ) {
        if (validateHeader()) {
            Itinerary itinerary = new Itinerary(departureCity,destinationCity);

        }
        return 0;
    }
    private boolean validateHeader(){
        MessageContext messageContext = wsc.getMessageContext();
        Map headers = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List) headers.get("Username");
        List ticketList = (List) headers.get("Ticket");
        String username = (String) userList.get(0);
        int ticket = Integer.parseInt((String) ticketList.get(0));

        System.out.println(username + " "+ticket);
        return authenticator.validateTicket(username,ticket);

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