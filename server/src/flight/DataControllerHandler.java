package flight;

import flight.authentication.UserController;
import flight.flight.FlightController;

/**
 * Created by peter on 2/8/16.
 */
public class DataControllerHandler {

    private static final UserController userController = new UserController();;
    private static final FlightController flightController = new FlightController();


    public static UserController getUserController(){
        return userController;
    }
    public static FlightController getFlightController(){
        //if ( flightController == null )
        //    flightController = new FlightController();
        return flightController;
    }

}
