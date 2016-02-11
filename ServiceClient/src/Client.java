import my.webservice.com.Auth;
import my.webservice.com.AuthService;

/**
 * Created by Pontus on 2016-02-10.
 */
public class Client {
    String token, pasword, username;
    public static void main(String[] args) {
        Client c = new Client();
        c.Login("Pontus","qwerty");
    }


    public Client(){

    }

    public void Login(String name, String pwd){
        this.username = name;
        this.pasword = pwd;
        try {
            Auth port = (new AuthService()).getAuthPort();
            token = port.authenticate(username, pasword);
            System.out.println("Authentication Token: " + token);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
