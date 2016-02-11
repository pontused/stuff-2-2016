import javax.jws.WebMethod;
import javax.jws.WebService;
import my.webservice.com.FlightHandlerService;
import my.webservice.com.FlightHandler;
import java.util.ArrayList;

/**
 * Created by Pontus on 2016-02-10.
 */
@WebService(targetNamespace = "my.webservice.com")
public class ItineraryHandler {

    public ItineraryHandler(){

    }

    @WebMethod
    public String findItinerary(String departure, String destination, String securityToken){
        String itid = "null";
        //check security token
        try {

            FlightHandler port = (new FlightHandlerService()).getFlightHandlerPort();

            ArrayList<String> li = (ArrayList<String>)port.getFlightsDepartures(departure);
            for (String id:li) {
                ArrayList<String> flight = (ArrayList<String>)port.getFlight(id);
                if(flight.get(2).equals(destination)){
                    //One jump link

                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return itid;
    }

    public class Itinerary{
        ArrayList<String> itli;
        public Itinerary(){

        }
        public void addId(String id){
            itli.add(id);
        }
        public ArrayList<String> getItineraryList(){
            return itli;
        }
    }
}