import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 * Created by Pontus on 2016-02-10.
 */
@WebService(targetNamespace = "my.webservice.com")
public class Auth {
    @WebMethod
    public String authenticate(String name, String pwd){
        return "null";
    }


}
