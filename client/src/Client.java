import com.flightservice.authenticate.AuthTicket;
import com.flightservice.authenticate.Authenticator;
import com.flightservice.authenticate.Authenticator_Service;
import com.flightservice.flight.Flight;
import com.flightservice.flight.FlightService;
import com.flightservice.flight.FlightService_Service;
import com.flightservice.flight.ObjectFactory;
import com.flightservice.itinerary.ItineraryService;
import com.flightservice.itinerary.ItineraryService_Service;


import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.*;

/**
 * Created by peter on 2/6/16.
 */
public class Client {

    private AuthTicket ticket;
    private String username;

    public static void main(String[] args) {

        Client client = new Client();
    }
    public Client(){

        username = "peter";
        ticket = authenticate("peter","peter");
        getFlightService();
    }

    private AuthTicket authenticate(String username, String password){
        Authenticator_Service authenticator_service = new Authenticator_Service();
        Authenticator authenticator = authenticator_service.getAuthenticatorPort();

        AuthTicket ticket = authenticator.authenticate(username,password);


        Map<String ,Object> regMap = ((BindingProvider) authenticator).getRequestContext();
        //regMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,"http://localhost:8080/server_war_exploded/Authenticator?wsdl");
        Map<String, List<String>> header = new HashMap<String, List<String>>();
        header.put("Username", Collections.singletonList(username));
        header.put("Ticket", Collections.singletonList(ticket.getTicket().toString()));
        regMap.put(MessageContext.HTTP_REQUEST_HEADERS,header);

        return ticket;


    }
    private void getItinerary(){
        ItineraryService_Service itineraryService = new ItineraryService_Service();
        ItineraryService itinerary = itineraryService.getItineraryPort();

    }

    private void getFlightService(){
        FlightService_Service flightService = new FlightService_Service();
        FlightService flightServicePort = flightService.getFlightPort();


        Map<String ,Object> regMap = ((BindingProvider) flightServicePort).getRequestContext();
        //regMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,"http://localhost:8080/server_war_exploded/Authenticator?wsdl");
        Map<String, List<String>> header = new HashMap<String, List<String>>();
        header.put("Username", Collections.singletonList("peter"));
        header.put("Ticket", Collections.singletonList(ticket.getTicket().toString()));
        regMap.put(MessageContext.HTTP_REQUEST_HEADERS,header);

        System.out.println("testar ");
        try{
            Flight f = flightServicePort.getFlightByID(1234);
            System.out.println(f);
        }catch (Exception e){

        }

    }

}
