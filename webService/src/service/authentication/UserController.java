package service.authentication;

import java.util.TreeMap;
import com.authenticator.AuthTicket;

/**
 * Created by peter on 2/3/16.
 */
public class UserController {

    private static TreeMap<String,User> userDB = new TreeMap<String,User>();;
    private static TreeMap<String,AuthTicket> ticketDB= new TreeMap<String, AuthTicket>();

    public UserController(){
        genUsers();
    }

    public void genUsers(){

        userDB.put("peter",new User("peter","peter"));
    }
    public AuthTicket authenticate(String user, String pass){
        AuthTicket ticket = new AuthTicket();
        ticket.setName(user);
        if (userDB.get(user).getPassword().equals(pass)){
            ticket.setTicket(genTicket(user));
            ticketDB.put(user,ticket);
            return ticket;
        }else{
            ticket.setTicket(null);
            return ticket;
        }
    }
    public boolean validateTicket(String username, Integer ticket){
        return ticketDB.containsKey(username) && ticketDB.get(username).getTicket().equals(ticket) ;

    }
    public AuthTicket getTicket(String username){
        if(ticketDB.containsKey(username))
            return ticketDB.get(username);
        else return null;
    }
    private Integer genTicket (String name){
        long time = System.currentTimeMillis();
        Integer ticket = (name + time).hashCode();
        return ticket;
    }



}
