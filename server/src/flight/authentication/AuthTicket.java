package flight.authentication;


import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * Created by peter on 2/3/16.
 */

//@SOAPBinding(style = SOAPBinding.Style.RPC)
public class AuthTicket implements Serializable {

    public final String name;
    public final Integer ticket;

    protected AuthTicket(String name,boolean allowed){
        this.name = name;
        if (allowed)
            this.ticket = genTicket(name);
        else this.ticket = null;
    }
    private Integer genTicket (String name){
        long time = System.currentTimeMillis();
        Integer ticket = (name + time).hashCode();
        return ticket;
    }


    public String toString(){
        return ticket.toString();
    }
}
