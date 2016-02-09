package flight.authentication;

import flight.DataControllerHandler;

import javax.activation.DataContentHandler;
import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

/**
 * Created by peter on 2/6/16.
 */
@WebService(endpointInterface = "flight.authentication.Authenticator", serviceName = "Authenticator", portName = "AuthenticatorPort", targetNamespace = "http://www.authenticator.com")
public class FlightAuthenticator implements Authenticator {

    private UserController userController = DataControllerHandler.getUserController();

    @Resource
    private WebServiceContext wsc;


    @Override
    public AuthTicket authenticate(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {

        MessageContext messageContext = wsc.getMessageContext();
        Map headers = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List) headers.get("Username");
        List passList = (List) headers.get("Password");

        AuthTicket ticket = userController.authenticate("peter","peter");
        System.out.println(ticket);
        //String username = "";
        //String password = "";
        //if (userList != null && passList != null) {
        //    username = (String) userList.get(0);
        //    password = (String) passList.get(0);
        //}

        if (username.equals("peter") && password.equals("peter")) {

            System.out.println(ticket);
            return ticket;

        }
        return new AuthTicket(username,false);
    }

    @Override
    public boolean validateTicket(String username, int ticket) {
        return userController.validateTicket(username,ticket);
    }
}