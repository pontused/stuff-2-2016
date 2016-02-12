import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.service.Authenticator.*;
import com.service.Itinerary.*;
import com.service.Flight.*;
/**
 * Created by Pontus on 2016-02-12.
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


        //getFlightService();

        List<Itinerary> flili = getItinerary("Stockholm","Galway");


        for (Itinerary fli :flili) {
            System.out.println("------");
            for (com.service.Itinerary.Flight f: fli.getFlightList()) {
                System.out.println("Flight " + f.getFlightID() + " departing from " + f.getDepartureCity() + " going to " + f.getDestinationCity());
                System.out.println("Departing at: " + f.getDepartureDate() + " and Ariving at: " + f.getArrivalDate());
                System.out.println("---");
            }
        }
    }

    private AuthTicket authenticate(String username, String password){
        Authenticator_Service authenticator_service = new Authenticator_Service();
        Authenticator authenticator = authenticator_service.getAuthenticatorPort();

        AuthTicket ticket = authenticator.authenticate(username,password);
        System.out.println("Ticket! "+ticket.getTicket());


        Map<String ,Object> regMap = ((BindingProvider) authenticator).getRequestContext();
        //regMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,"http://localhost:8080/server_war_exploded/Authenticator?wsdl");
        Map<String, List<String>> header = new HashMap<String, List<String>>();
        header.put("Username", Collections.singletonList(username));
        header.put("Ticket", Collections.singletonList(ticket.getTicket().toString()));
        regMap.put(MessageContext.HTTP_REQUEST_HEADERS,header);

        return ticket;


    }
    private List<Itinerary>  getItinerary(String depart, String destination){
        System.out.println("Itinerary: " + depart + " to " + destination);
        ItineraryService_Service itineraryService = new ItineraryService_Service();
        ItineraryService itinerary = itineraryService.getItineraryPort();
        List<Itinerary> itli = itinerary.getItinerary(depart,destination);
        return itli;

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

            com.service.Flight.Flight f = flightServicePort.getFlightByID(1234);
            System.out.println(f.getDestinationCity() + "  "+f.getDepartureDate());
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
