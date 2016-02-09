import com.flightservice.authenticate.AuthTicket;
import com.flightservice.authenticate.Authenticator;
import com.flightservice.authenticate.Authenticator_Service;
import com.flightservice.itinerary.ItineraryService;
import com.flightservice.itinerary.ItineraryService_Service;


import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.*;

/**
 * Created by peter on 2/6/16.
 */
public class Client {
    public static void main(String[] args) {
        Authenticator_Service authenticator_service = new Authenticator_Service();
        Authenticator authenticator = authenticator_service.getAuthenticatorPort();

        ItineraryService_Service itineraryService = new ItineraryService_Service();
        ItineraryService itinerary = itineraryService.getItineraryPort();

        AuthTicket ticket = authenticator.authenticate("peter","peter");

        itinerary.getItinerary("peter", ticket.getTicket());

        /*
        Map<String ,Object> regMap = ((BindingProvider) soap).getRequestContext();
        regMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,"http://localhost:8080/server_war_exploded/Authenticator?wsdl");
        Map<String, List<String>> header = new HashMap<String, List<String>>();
        header.put("Username", Collections.singletonList("peter"));
        header.put("Password", Collections.singletonList("peter"));
        regMap.put(MessageContext.HTTP_REQUEST_HEADERS,header);
        */
        System.out.println(authenticator.authenticate("peter","sdf").getTicket());

    }
}
