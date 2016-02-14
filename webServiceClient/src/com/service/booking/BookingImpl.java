
package com.service.booking;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Booking_impl", targetNamespace = "http://booking.service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookingImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTicket", targetNamespace = "http://booking.service/", className = "com.service.booking.GetTicket")
    @ResponseWrapper(localName = "getTicketResponse", targetNamespace = "http://booking.service/", className = "com.service.booking.GetTicketResponse")
    @Action(input = "http://booking.service/Booking_impl/getTicketRequest", output = "http://booking.service/Booking_impl/getTicketResponse")
    public String getTicket(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookTicket", targetNamespace = "http://booking.service/", className = "com.service.booking.BookTicket")
    @ResponseWrapper(localName = "bookTicketResponse", targetNamespace = "http://booking.service/", className = "com.service.booking.BookTicketResponse")
    @Action(input = "http://booking.service/Booking_impl/bookTicketRequest", output = "http://booking.service/Booking_impl/bookTicketResponse")
    public int bookTicket(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.service.booking.Itinerary
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookItinerary", targetNamespace = "http://booking.service/", className = "com.service.booking.BookItinerary")
    @ResponseWrapper(localName = "bookItineraryResponse", targetNamespace = "http://booking.service/", className = "com.service.booking.BookItineraryResponse")
    @Action(input = "http://booking.service/Booking_impl/bookItineraryRequest", output = "http://booking.service/Booking_impl/bookItineraryResponse")
    public Itinerary bookItinerary(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "creditValid", targetNamespace = "http://booking.service/", className = "com.service.booking.CreditValid")
    @ResponseWrapper(localName = "creditValidResponse", targetNamespace = "http://booking.service/", className = "com.service.booking.CreditValidResponse")
    @Action(input = "http://booking.service/Booking_impl/creditValidRequest", output = "http://booking.service/Booking_impl/creditValidResponse")
    public boolean creditValid(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
