package service;

import service.authentication.UserController;
import service.bank.AccountController;
import service.flight.FlightController;

/**
 * Created by peter on 2/8/16.
 */
public class DataControllerHandler {

    private static final UserController userController = new UserController();;
    private static final FlightController flightController = new FlightController();
    private static final AccountController accountController = new AccountController();


    public static UserController getUserController(){
        return userController;
    }
    public static FlightController getFlightController(){
        //if ( flightController == null )
        //    flightController = new FlightController();
        return flightController;
    }
    public static AccountController getAccountController(){
        return accountController;
    }

}
