
package service.booking.com.itinerary;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ItineraryService", targetNamespace = "http://www.itineraryservice.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ItineraryService {


    /**
     * 
     * @param destinationCity
     * @param departureCity
     * @return
     *     returns java.util.List<service.booking.com.itinerary.Itinerary>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItinerary", targetNamespace = "http://www.itineraryservice.com", className = "service.booking.com.itinerary.GetItinerary")
    @ResponseWrapper(localName = "getItineraryResponse", targetNamespace = "http://www.itineraryservice.com", className = "service.booking.com.itinerary.GetItineraryResponse")
    @Action(input = "http://www.itineraryservice.com/ItineraryService/getItineraryRequest", output = "http://www.itineraryservice.com/ItineraryService/getItineraryResponse")
    public List<Itinerary> getItinerary(
        @WebParam(name = "departureCity", targetNamespace = "")
        String departureCity,
        @WebParam(name = "destinationCity", targetNamespace = "")
        String destinationCity);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<service.booking.com.itinerary.Itinerary>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItineraryByID", targetNamespace = "http://www.itineraryservice.com", className = "service.booking.com.itinerary.GetItineraryByID")
    @ResponseWrapper(localName = "getItineraryByIDResponse", targetNamespace = "http://www.itineraryservice.com", className = "service.booking.com.itinerary.GetItineraryByIDResponse")
    @Action(input = "http://www.itineraryservice.com/ItineraryService/getItineraryByIDRequest", output = "http://www.itineraryservice.com/ItineraryService/getItineraryByIDResponse")
    public List<Itinerary> getItineraryByID(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "validateItMap", targetNamespace = "http://www.itineraryservice.com", className = "service.booking.com.itinerary.ValidateItMap")
    @ResponseWrapper(localName = "validateItMapResponse", targetNamespace = "http://www.itineraryservice.com", className = "service.booking.com.itinerary.ValidateItMapResponse")
    @Action(input = "http://www.itineraryservice.com/ItineraryService/validateItMapRequest", output = "http://www.itineraryservice.com/ItineraryService/validateItMapResponse")
    public void validateItMap(
        @WebParam(name = "arg0", targetNamespace = "")
        XMLGregorianCalendar arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns float
     * @throws ItineraryNotAvailable_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkAvailability", targetNamespace = "http://www.itineraryservice.com", className = "service.booking.com.itinerary.CheckAvailability")
    @ResponseWrapper(localName = "checkAvailabilityResponse", targetNamespace = "http://www.itineraryservice.com", className = "service.booking.com.itinerary.CheckAvailabilityResponse")
    @Action(input = "http://www.itineraryservice.com/ItineraryService/checkAvailabilityRequest", output = "http://www.itineraryservice.com/ItineraryService/checkAvailabilityResponse", fault = {
        @FaultAction(className = ItineraryNotAvailable_Exception.class, value = "http://www.itineraryservice.com/ItineraryService/checkAvailability/Fault/ItineraryNotAvailable")
    })
    public float checkAvailability(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws ItineraryNotAvailable_Exception
    ;

}
