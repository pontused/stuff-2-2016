
package my.webservice.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the my.webservice.com package. 
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

    private final static QName _GetFlightsDepartures_QNAME = new QName("my.webservice.com", "getFlightsDepartures");
    private final static QName _GetFlightsDeparturesResponse_QNAME = new QName("my.webservice.com", "getFlightsDeparturesResponse");
    private final static QName _GetFlight_QNAME = new QName("my.webservice.com", "getFlight");
    private final static QName _GetFlightsDestinationResponse_QNAME = new QName("my.webservice.com", "getFlightsDestinationResponse");
    private final static QName _GetFlightsDestination_QNAME = new QName("my.webservice.com", "getFlightsDestination");
    private final static QName _GetFlightResponse_QNAME = new QName("my.webservice.com", "getFlightResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: my.webservice.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFlightResponse }
     * 
     */
    public GetFlightResponse createGetFlightResponse() {
        return new GetFlightResponse();
    }

    /**
     * Create an instance of {@link GetFlightsDestination }
     * 
     */
    public GetFlightsDestination createGetFlightsDestination() {
        return new GetFlightsDestination();
    }

    /**
     * Create an instance of {@link GetFlightsDestinationResponse }
     * 
     */
    public GetFlightsDestinationResponse createGetFlightsDestinationResponse() {
        return new GetFlightsDestinationResponse();
    }

    /**
     * Create an instance of {@link GetFlightsDepartures }
     * 
     */
    public GetFlightsDepartures createGetFlightsDepartures() {
        return new GetFlightsDepartures();
    }

    /**
     * Create an instance of {@link GetFlight }
     * 
     */
    public GetFlight createGetFlight() {
        return new GetFlight();
    }

    /**
     * Create an instance of {@link GetFlightsDeparturesResponse }
     * 
     */
    public GetFlightsDeparturesResponse createGetFlightsDeparturesResponse() {
        return new GetFlightsDeparturesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsDepartures }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "my.webservice.com", name = "getFlightsDepartures")
    public JAXBElement<GetFlightsDepartures> createGetFlightsDepartures(GetFlightsDepartures value) {
        return new JAXBElement<GetFlightsDepartures>(_GetFlightsDepartures_QNAME, GetFlightsDepartures.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsDeparturesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "my.webservice.com", name = "getFlightsDeparturesResponse")
    public JAXBElement<GetFlightsDeparturesResponse> createGetFlightsDeparturesResponse(GetFlightsDeparturesResponse value) {
        return new JAXBElement<GetFlightsDeparturesResponse>(_GetFlightsDeparturesResponse_QNAME, GetFlightsDeparturesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "my.webservice.com", name = "getFlight")
    public JAXBElement<GetFlight> createGetFlight(GetFlight value) {
        return new JAXBElement<GetFlight>(_GetFlight_QNAME, GetFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsDestinationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "my.webservice.com", name = "getFlightsDestinationResponse")
    public JAXBElement<GetFlightsDestinationResponse> createGetFlightsDestinationResponse(GetFlightsDestinationResponse value) {
        return new JAXBElement<GetFlightsDestinationResponse>(_GetFlightsDestinationResponse_QNAME, GetFlightsDestinationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "my.webservice.com", name = "getFlightsDestination")
    public JAXBElement<GetFlightsDestination> createGetFlightsDestination(GetFlightsDestination value) {
        return new JAXBElement<GetFlightsDestination>(_GetFlightsDestination_QNAME, GetFlightsDestination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "my.webservice.com", name = "getFlightResponse")
    public JAXBElement<GetFlightResponse> createGetFlightResponse(GetFlightResponse value) {
        return new JAXBElement<GetFlightResponse>(_GetFlightResponse_QNAME, GetFlightResponse.class, null, value);
    }

}
