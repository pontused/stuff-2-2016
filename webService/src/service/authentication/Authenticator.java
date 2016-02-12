package service.authentication;

import service.DataControllerHandler;

import javax.activation.DataContentHandler;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

/**
 * Created by peter on 2/6/16.
 */
@WebService( serviceName = "Authenticator", portName = "AuthenticatorPort", targetNamespace = "http://www.authenticator.com")
public class Authenticator  {

    private UserController userController = DataControllerHandler.getUserController();

    @Resource
    private WebServiceContext wsc;

    @WebMethod
    public AuthTicket authenticate(String username, String password) {

        MessageContext messageContext = wsc.getMessageContext();
        Map headers = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List) headers.get("Username");
        List passList = (List) headers.get("Password");

        AuthTicket ticket = userController.authenticate("peter","peter");
        //String username = "";
        //String password = "";
        //if (userList != null && passList != null) {
        //    username = (String) userList.get(0);
        //    password = (String) passList.get(0);
        //}

        return ticket;
    }

    @WebMethod
    public boolean validateTicket(String username, int ticket) {
        return userController.validateTicket(username,ticket);
    }
}