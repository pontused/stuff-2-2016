package flight.flight;

import flight.DataControllerHandler;
import flight.authentication.Authenticator;
import flight.authentication.FlightAuthenticator;
import flight.authentication.NotAuthenticatedException;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by peter on 2/8/16.
 */
@WebService(serviceName = "FlightService", portName = "FlightPort", targetNamespace = "http://www.flightservice.com")

public class FlightService {

    private FlightController flightController = DataControllerHandler.getFlightController();
    private Authenticator authenticator = new FlightAuthenticator();

    @Resource
    private WebServiceContext wsc;

    @WebMethod(operationName = "getFlightByID")
    public Flight getFlightByID(@WebParam(name = "flightID") int flightID) throws NotAuthenticatedException {

        if (validateHeader()) {
            return flightController.getFlightByID(flightID);
        }else throw new NotAuthenticatedException();
    }
    @WebMethod(operationName = "getFlights")
    public ArrayList<Flight> getFlights() {
        return flightController.getFlights();
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
