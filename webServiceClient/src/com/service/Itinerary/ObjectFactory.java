
package com.service.Itinerary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service.Itinerary package. 
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

    private final static QName _GetItineraryResponse_QNAME = new QName("http://www.itineraryservice.com", "getItineraryResponse");
    private final static QName _ItineraryNotAvailable_QNAME = new QName("http://www.itineraryservice.com", "ItineraryNotAvailable");
    private final static QName _CheckAvailabilityResponse_QNAME = new QName("http://www.itineraryservice.com", "checkAvailabilityResponse");
    private final static QName _ValidateItMap_QNAME = new QName("http://www.itineraryservice.com", "validateItMap");
    private final static QName _CheckAvailability_QNAME = new QName("http://www.itineraryservice.com", "checkAvailability");
    private final static QName _GetItinerary_QNAME = new QName("http://www.itineraryservice.com", "getItinerary");
    private final static QName _ValidateItMapResponse_QNAME = new QName("http://www.itineraryservice.com", "validateItMapResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service.Itinerary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link GetItineraryResponse }
     * 
     */
    public GetItineraryResponse createGetItineraryResponse() {
        return new GetItineraryResponse();
    }

    /**
     * Create an instance of {@link ItineraryNotAvailable }
     * 
     */
    public ItineraryNotAvailable createItineraryNotAvailable() {
        return new ItineraryNotAvailable();
    }

    /**
     * Create an instance of {@link CheckAvailabilityResponse }
     * 
     */
    public CheckAvailabilityResponse createCheckAvailabilityResponse() {
        return new CheckAvailabilityResponse();
    }

    /**
     * Create an instance of {@link ValidateItMap }
     * 
     */
    public ValidateItMap createValidateItMap() {
        return new ValidateItMap();
    }

    /**
     * Create an instance of {@link GetItinerary }
     * 
     */
    public GetItinerary createGetItinerary() {
        return new GetItinerary();
    }

    /**
     * Create an instance of {@link CheckAvailability }
     * 
     */
    public CheckAvailability createCheckAvailability() {
        return new CheckAvailability();
    }

    /**
     * Create an instance of {@link ValidateItMapResponse }
     * 
     */
    public ValidateItMapResponse createValidateItMapResponse() {
        return new ValidateItMapResponse();
    }

    /**
     * Create an instance of {@link Itinerary }
     * 
     */
    public Itinerary createItinerary() {
        return new Itinerary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItineraryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.itineraryservice.com", name = "getItineraryResponse")
    public JAXBElement<GetItineraryResponse> createGetItineraryResponse(GetItineraryResponse value) {
        return new JAXBElement<GetItineraryResponse>(_GetItineraryResponse_QNAME, GetItineraryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryNotAvailable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.itineraryservice.com", name = "ItineraryNotAvailable")
    public JAXBElement<ItineraryNotAvailable> createItineraryNotAvailable(ItineraryNotAvailable value) {
        return new JAXBElement<ItineraryNotAvailable>(_ItineraryNotAvailable_QNAME, ItineraryNotAvailable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.itineraryservice.com", name = "checkAvailabilityResponse")
    public JAXBElement<CheckAvailabilityResponse> createCheckAvailabilityResponse(CheckAvailabilityResponse value) {
        return new JAXBElement<CheckAvailabilityResponse>(_CheckAvailabilityResponse_QNAME, CheckAvailabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateItMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.itineraryservice.com", name = "validateItMap")
    public JAXBElement<ValidateItMap> createValidateItMap(ValidateItMap value) {
        return new JAXBElement<ValidateItMap>(_ValidateItMap_QNAME, ValidateItMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.itineraryservice.com", name = "checkAvailability")
    public JAXBElement<CheckAvailability> createCheckAvailability(CheckAvailability value) {
        return new JAXBElement<CheckAvailability>(_CheckAvailability_QNAME, CheckAvailability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItinerary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.itineraryservice.com", name = "getItinerary")
    public JAXBElement<GetItinerary> createGetItinerary(GetItinerary value) {
        return new JAXBElement<GetItinerary>(_GetItinerary_QNAME, GetItinerary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateItMapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.itineraryservice.com", name = "validateItMapResponse")
    public JAXBElement<ValidateItMapResponse> createValidateItMapResponse(ValidateItMapResponse value) {
        return new JAXBElement<ValidateItMapResponse>(_ValidateItMapResponse_QNAME, ValidateItMapResponse.class, null, value);
    }

}
