
package com.service.Flight;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service.Flight package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetFlightByID_QNAME = new QName("http://www.flightservice.com", "getFlightByID");
    private final static QName _NotAuthenticatedException_QNAME = new QName("http://www.flightservice.com", "NotAuthenticatedException");
    private final static QName _GetFlights_QNAME = new QName("http://www.flightservice.com", "getFlights");
    private final static QName _FlightDoesNotExistException_QNAME = new QName("http://www.flightservice.com", "FlightDoesNotExistException");
    private final static QName _ParseException_QNAME = new QName("http://www.flightservice.com", "ParseException");
    private final static QName _GetFlightsResponse_QNAME = new QName("http://www.flightservice.com", "getFlightsResponse");
    private final static QName _GetFlightByIDResponse_QNAME = new QName("http://www.flightservice.com", "getFlightByIDResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service.Flight
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFlights }
     * 
     */
    public GetFlights createGetFlights() {
        return new GetFlights();
    }

    /**
     * Create an instance of {@link GetFlightByID }
     * 
     */
    public GetFlightByID createGetFlightByID() {
        return new GetFlightByID();
    }

    /**
     * Create an instance of {@link NotAuthenticatedException }
     * 
     */
    public NotAuthenticatedException createNotAuthenticatedException() {
        return new NotAuthenticatedException();
    }

    /**
     * Create an instance of {@link GetFlightByIDResponse }
     * 
     */
    public GetFlightByIDResponse createGetFlightByIDResponse() {
        return new GetFlightByIDResponse();
    }

    /**
     * Create an instance of {@link FlightDoesNotExistException }
     * 
     */
    public FlightDoesNotExistException createFlightDoesNotExistException() {
        return new FlightDoesNotExistException();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link GetFlightsResponse }
     * 
     */
    public GetFlightsResponse createGetFlightsResponse() {
        return new GetFlightsResponse();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightByID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.flightservice.com", name = "getFlightByID")
    public JAXBElement<GetFlightByID> createGetFlightByID(GetFlightByID value) {
        return new JAXBElement<GetFlightByID>(_GetFlightByID_QNAME, GetFlightByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotAuthenticatedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.flightservice.com", name = "NotAuthenticatedException")
    public JAXBElement<NotAuthenticatedException> createNotAuthenticatedException(NotAuthenticatedException value) {
        return new JAXBElement<NotAuthenticatedException>(_NotAuthenticatedException_QNAME, NotAuthenticatedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.flightservice.com", name = "getFlights")
    public JAXBElement<GetFlights> createGetFlights(GetFlights value) {
        return new JAXBElement<GetFlights>(_GetFlights_QNAME, GetFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDoesNotExistException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.flightservice.com", name = "FlightDoesNotExistException")
    public JAXBElement<FlightDoesNotExistException> createFlightDoesNotExistException(FlightDoesNotExistException value) {
        return new JAXBElement<FlightDoesNotExistException>(_FlightDoesNotExistException_QNAME, FlightDoesNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.flightservice.com", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.flightservice.com", name = "getFlightsResponse")
    public JAXBElement<GetFlightsResponse> createGetFlightsResponse(GetFlightsResponse value) {
        return new JAXBElement<GetFlightsResponse>(_GetFlightsResponse_QNAME, GetFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.flightservice.com", name = "getFlightByIDResponse")
    public JAXBElement<GetFlightByIDResponse> createGetFlightByIDResponse(GetFlightByIDResponse value) {
        return new JAXBElement<GetFlightByIDResponse>(_GetFlightByIDResponse_QNAME, GetFlightByIDResponse.class, null, value);
    }

}
