import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.service.auth.*;
import com.service.booking.BookingImpl;
import com.service.booking.BookingImplService;
import com.service.itinerary.*;

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


        List<Itinerary> flili = getItinerary("Stockholm","Galway");

        float price;
        for (Itinerary fli :flili) {
            System.out.println("------");
            for (Flight f: fli.getFlightList()) {
                System.out.println("Flight " + f.getFlightID() + " departing from " + f.getDepartureCity() + " going to " + f.getDestinationCity());
                System.out.println("Departing at: " + f.getDepartureDate() + " and Ariving at: " + f.getArrivalDate());
                System.out.println("---");
            }
            try {
                price = checkAvailability(fli.getId());
                System.out.println("Price: " + price);
            }catch(ItineraryNotAvailable_Exception e){
                System.out.println("Price: the Itinerary is not available");
            }
        }

        bookItinerary(flili.get(1), "1234");
    }

    private void bookItinerary(Itinerary it, String cc){
        BookingImpl bookingport = (new BookingImplService()).getBookingImplPort();

        String ticket;
        int transactionid = bookingport.bookTicket(cc,it.getId());
        ticket = bookingport.getTicket(transactionid);
        System.out.println(ticket);

    }

    private AuthTicket authenticate(String username, String password){
        AuthenticatorService authenticator_service = new AuthenticatorService();
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

    private float checkAvailability(int id) throws ItineraryNotAvailable_Exception{
        ItineraryService_Service itineraryService = new ItineraryService_Service();
        ItineraryService itineraryServicePort = itineraryService.getItineraryPort();

        return itineraryServicePort.checkAvailability(id);
    }

    private List<Itinerary>  getItinerary(String depart, String destination){
        ItineraryService_Service itineraryService = new ItineraryService_Service();
        ItineraryService itineraryServicePort = itineraryService.getItineraryPort();

        Map<String ,Object> regMap = ((BindingProvider) itineraryServicePort).getRequestContext();
        //regMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,"http://localhost:8080/server_war_exploded/Authenticator?wsdl");
        Map<String, List<String>> header = new HashMap<String, List<String>>();
        header.put("Username", Collections.singletonList("peter"));
        header.put("Ticket", Collections.singletonList(ticket.getTicket().toString()));
        regMap.put(MessageContext.HTTP_REQUEST_HEADERS,header);


        System.out.println("Itinerary: " + depart + " to " + destination);
      //  ItineraryService_Service itineraryService = new ItineraryService_Service();
       // ItineraryService itinerary = itineraryService.getItineraryPort();
        List<Itinerary> itli = itineraryServicePort.getItinerary(depart,destination);
        return itli;

    }
    /*
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
    */
}
