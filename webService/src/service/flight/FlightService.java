package service.flight;

import service.DataControllerHandler;
import service.authentication.Authenticator;
import service.authentication.NotAuthenticatedException;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by peter on 2/8/16.
 */
@WebService(serviceName = "FlightService", portName = "FlightPort", targetNamespace = "http://www.flightservice.com")

public class FlightService {

    private FlightController flightController = DataControllerHandler.getFlightController();
    private Authenticator authenticator = new Authenticator();

    @Resource
    private WebServiceContext wsc;

    @WebMethod(operationName = "getFlightByID")
    public Flight getFlightByID(int flightID) throws NotAuthenticatedException, FlightDoesNotExistException{
        if (validateHeader()) {
            Flight flight = flightController.getFlightByID(flightID);
            if (flight != null)
                return flightController.getFlightByID(flightID);
            else throw new FlightDoesNotExistException();
        }else throw new NotAuthenticatedException();
    }

    @WebMethod(operationName = "getFlights")
    public ArrayList<Flight> getFlights(String departureCity,String departureTime) throws ParseException{
        return flightController.getFlights(departureCity, departureTime);
    }



    private boolean validateHeader(){
        MessageContext messageContext = wsc.getMessageContext();
        Map headers = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List) headers.get("Username");
        List ticketList = (List) headers.get("Ticket");
        String username = (String) userList.get(0);
        int ticket = Integer.parseInt((String) ticketList.get(0));
        //System.out.println(username + " "+ticket);
        return authenticator.validateTicket(username,ticket);
    }

}
