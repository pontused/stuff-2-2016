package flight.authentication;

import javax.annotation.Resource;

/**
 * Created by peter on 1/31/16.
 */


public class User {
    private String username;
    private String password;


    public User(String username,String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}

