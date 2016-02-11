import javax.xml.ws.Endpoint;
/**
 * Created by Pontus on 2016-02-10.
 */
public class Driver {
    public static void main(String[] args){
        Driver d = new Driver();
    }
    public Driver(){
        Endpoint.publish("http://0.0.0.0:1000/Auth", new Auth());
        //Endpoint.publish("http://0.0.0.0:1001/Itinerary", new Itinerary());
        Endpoint.publish("http://0.0.0.0:1002/Flight", new FlightHandler());

    }
}
