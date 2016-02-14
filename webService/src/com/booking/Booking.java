
package com.booking;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Booking", targetNamespace = "http://www.Booking.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Booking {


    /**
     * 
     * @param itineraryid
     * @param creditcard
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "transacionid", targetNamespace = "")
    @RequestWrapper(localName = "bookTicket", targetNamespace = "http://www.Booking.com", className = "com.booking.BookTicket")
    @ResponseWrapper(localName = "bookTicketResponse", targetNamespace = "http://www.Booking.com", className = "com.booking.BookTicketResponse")
    public int bookTicket(
        @WebParam(name = "creditcard", targetNamespace = "")
        String creditcard,
        @WebParam(name = "itineraryid", targetNamespace = "")
        int itineraryid);

    /**
     * 
     * @param transacionid
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "ticket", targetNamespace = "")
    @RequestWrapper(localName = "getTicket", targetNamespace = "http://www.Booking.com", className = "com.booking.GetTicket")
    @ResponseWrapper(localName = "getTicketResponse", targetNamespace = "http://www.Booking.com", className = "com.booking.GetTicketResponse")
    public String getTicket(
        @WebParam(name = "transacionid", targetNamespace = "")
        int transacionid);

}