package service.itinerary;

import service.authentication.Authenticator;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import service.itinerary.com.Flight.*;
/**
 * Created by peter on 2/1/16.
 */


@WebService(serviceName = "ItineraryService", portName = "ItineraryPort", targetNamespace = "http://www.itineraryservice.com")

public class ItineraryService {

    private HashMap<String,List<Itinerary>> itmap;
    private SerialnumberGenerator sg;
    public ItineraryService(){
        itmap = new HashMap<String,List<Itinerary>>();
        sg = new SerialnumberGenerator();
    }

    private Authenticator authenticator = new Authenticator();

    @Resource
    private WebServiceContext wsc;

    @WebMethod(operationName = "getItinerary")
    public List<Itinerary> getItinerary(@WebParam (name = "departureCity") String departureCity, @WebParam (name = "destinationCity") String destinationCity )  {

        FlightTree ft;
        Date time;
        List<List<Flight>> flili = null;
        List<Itinerary> itli = new ArrayList<Itinerary>();
        String routkey = departureCity + " : " + destinationCity;
        if (validateHeader()) {

            try {
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                time = format.parse("12-03-2015 10:30");

                //Validate that all known itinerarys are still valid, romves non valid onse.
                validateItMap(time);
                if (itmap.containsKey(routkey)){
                    System.out.println("Retriving itinerarys");
                    itli = itmap.get(routkey);

                }else{
                    System.out.println("Compiling itinerarys");
                    ft = new FlightTree(departureCity, time, 5);
                    flili = ft.getItinerary(destinationCity);
                    Itinerary it;
                    for (List<Flight> fli: flili) {
                        it = new Itinerary(departureCity, destinationCity, sg.getNewSN());
                        for (Flight f:fli) {
                            it.setFlight(f);
                        }
                        itli.add(it);
                    }
                    itmap.put(routkey, itli);
                }

            }catch(ParseException pe){

            }
        }


        //Itinerary itinerary = new Itinerary(departureCity,destinationCity);
        return itli;

    }
    @WebMethod(operationName = "checkAvailability")

    public float checkAvailability(int id) throws ItineraryNotAvailable{
        //Check all know itinerarys for a matching id.
        //then goes thorugh that itinerary checking for seats and addint up the price.
        float price  = 0;
        //if (validateHeader()) {
            for (String key:itmap.keySet()) {
                List<Itinerary> itli = itmap.get(key);
                for (Itinerary it: itli) {
                    if(it.getId() == id){
                        for(Flight f:it.getFlightList()){
                            if (f.getAvailableSeats()>0){
                                price = price + f.getPrice();
                            }else throw new ItineraryNotAvailable();
                        }
                    }
                }
            }
        //}
        return price;
    }


    private boolean validateHeader(){
        MessageContext messageContext = wsc.getMessageContext();
        Map headers = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List) headers.get("Username");
        List ticketList = (List) headers.get("Ticket");
        String username = (String) userList.get(0);
        int ticket = Integer.parseInt((String) ticketList.get(0));

        System.out.println(username + " " + ticket);
        return authenticator.validateTicket(username,ticket);

    }

    public void validateItMap(Date time){
        //Check that all known itinerarys are valid.
        FlightService port = (new FlightService_Service()).getFlightPort();

        GregorianCalendar c = new GregorianCalendar();
        c.setTime(time);

        HashMap<String,List<Itinerary>> itmap_temp = new HashMap();
        ArrayList<Itinerary> itli_temp = new ArrayList<>();
        Boolean ok;
        for (String key:itmap.keySet()) {
            List<Itinerary> itli = itmap.get(key);
            for (Itinerary it: itli) {
                ok = true;
                itli_temp = new ArrayList<>();
                for(Flight f: it.getFlightList()){
                    //if the flight departure time has passed.
                    if(f.getDepartureDate().toGregorianCalendar().after(c)){
                        //Exception if the flight can not be found
                        try{
                            //if there are seats
                            if(port.getFlightByID(f.getFlightID()).getAvailableSeats()>0){
                            }else{
                                ok = false;
                            }
                        }catch(Exception e){
                            ok = false;
                        }
                    }else{
                        ok = false;
                    }
                }
                if(ok){
                    itli_temp.add(it);
                }
            }
            if(itli_temp.size()>0){
                itmap_temp.put(key, itli_temp);
            }
        }
        this.itmap = itmap_temp;
    };

    public class SerialnumberGenerator {
        int sn;
        public SerialnumberGenerator(){
            this.sn = 0;
        }

        public int getNewSN(){
            return this.sn++;
        }
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