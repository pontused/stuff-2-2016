package service.authentication;

import java.util.TreeMap;

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
        if (userDB.get(user).getPassword().equals(pass)){
            AuthTicket ticket = new AuthTicket(user,true);
            ticketDB.put(user,ticket);
            return ticket;
        }else return new AuthTicket(user,false);
    }
    public boolean validateTicket(String username, Integer ticket){
        return ticketDB.containsKey(username) && ticketDB.get(username).ticket.equals(ticket) ;

    }
    public AuthTicket getTicket(String username){
        if(ticketDB.containsKey(username))
            return ticketDB.get(username);
        else return null;
    }


}
