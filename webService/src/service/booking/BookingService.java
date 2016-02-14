package service.booking;

import service.booking.com.itinerary.ItineraryNotAvailable_Exception;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 * Created by Pontus on 2016-02-13.
 */
@WebService(serviceName = "BookingService", portName = "BookingServicePort", targetNamespace = "http://www.bookingservice.com")
public class BookingService {
    @WebMethod(operationName = "bookTicket")
    public int bookTicket(@WebParam (name = "itinerary") int itinerary, @WebParam (name = "creditcard") String creditcard ) throws PaymentMethodRejected {
        //throws an exception if the payment method is not valid
        //returns the transaction id
        return 0;
    }

    @WebMethod(operationName = "getTicket")
    public String getTicket(@WebParam (name = "transactionID") int transactionID ) throws PaymentMethodRejected  {
        //throws an exception if payment for transactionID fails
        //returns the transaction id
        return "ticket";
    }

}
