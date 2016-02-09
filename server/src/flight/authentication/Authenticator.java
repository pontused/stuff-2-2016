package flight.authentication;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by peter on 2/6/16.
 */
@WebService
public interface Authenticator {



    @WebMethod
    public AuthTicket authenticate(String username, String password);

    @WebMethod
    public boolean validateTicket(String username, int ticket);
}
