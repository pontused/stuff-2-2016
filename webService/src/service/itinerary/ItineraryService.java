package service.itinerary;

import service.authentication.Authenticator;
import service.itinerary.com.Flight.Flight;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

                validateItMap(time);
/*
                //check if a known itinerary exist for this rout

*/





                ft = new FlightTree(departureCity, time, 5);
                flili = ft.getItinerary(destinationCity);
                Itinerary it;
                for (List<Flight> fli: flili) {
                     it = new Itinerary(departureCity, destinationCity);
                    for (Flight f:fli) {
                        it.setFlight(f);
                    }
                    itli.add(it);
                }

            }catch(ParseException pe){

            }
            //add to known itinerarys for this rout
        }


        //Itinerary itinerary = new Itinerary(departureCity,destinationCity);
        return itli;

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

    public void validateItMap(Date time){
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(time);

        HashMap<String,List<Itinerary>> itmap_temp;
        Boolean ok;
        for (List<Itinerary> itli:itmap.values()) {

            for (Itinerary it: itli) {
                ok = true;
                for(Flight f: it.getFlightList()){
                    if(f.getDepartureDate().toGregorianCalendar().after(c)){

                    }else{
                        ok = false;
                    }
                }
            }
        }

    };
    /*
                    //check if a known itinerary exist for this rout

    */
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