
package com.service.booking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service.booking package. 
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

    private final static QName _BookTicket_QNAME = new QName("http://booking.service/", "bookTicket");
    private final static QName _CreditValid_QNAME = new QName("http://booking.service/", "creditValid");
    private final static QName _CreditValidResponse_QNAME = new QName("http://booking.service/", "creditValidResponse");
    private final static QName _BookItinerary_QNAME = new QName("http://booking.service/", "bookItinerary");
    private final static QName _GetTicket_QNAME = new QName("http://booking.service/", "getTicket");
    private final static QName _BookItineraryResponse_QNAME = new QName("http://booking.service/", "bookItineraryResponse");
    private final static QName _GetTicketResponse_QNAME = new QName("http://booking.service/", "getTicketResponse");
    private final static QName _BookTicketResponse_QNAME = new QName("http://booking.service/", "bookTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service.booking
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
     * Create an instance of {@link BookTicket }
     * 
     */
    public BookTicket createBookTicket() {
        return new BookTicket();
    }

    /**
     * Create an instance of {@link CreditValid }
     * 
     */
    public CreditValid createCreditValid() {
        return new CreditValid();
    }

    /**
     * Create an instance of {@link CreditValidResponse }
     * 
     */
    public CreditValidResponse createCreditValidResponse() {
        return new CreditValidResponse();
    }

    /**
     * Create an instance of {@link BookItineraryResponse }
     * 
     */
    public BookItineraryResponse createBookItineraryResponse() {
        return new BookItineraryResponse();
    }

    /**
     * Create an instance of {@link GetTicketResponse }
     * 
     */
    public GetTicketResponse createGetTicketResponse() {
        return new GetTicketResponse();
    }

    /**
     * Create an instance of {@link BookTicketResponse }
     * 
     */
    public BookTicketResponse createBookTicketResponse() {
        return new BookTicketResponse();
    }

    /**
     * Create an instance of {@link BookItinerary }
     * 
     */
    public BookItinerary createBookItinerary() {
        return new BookItinerary();
    }

    /**
     * Create an instance of {@link GetTicket }
     * 
     */
    public GetTicket createGetTicket() {
        return new GetTicket();
    }

    /**
     * Create an instance of {@link Itinerary }
     * 
     */
    public Itinerary createItinerary() {
        return new Itinerary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booking.service/", name = "bookTicket")
    public JAXBElement<BookTicket> createBookTicket(BookTicket value) {
        return new JAXBElement<BookTicket>(_BookTicket_QNAME, BookTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditValid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booking.service/", name = "creditValid")
    public JAXBElement<CreditValid> createCreditValid(CreditValid value) {
        return new JAXBElement<CreditValid>(_CreditValid_QNAME, CreditValid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditValidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booking.service/", name = "creditValidResponse")
    public JAXBElement<CreditValidResponse> createCreditValidResponse(CreditValidResponse value) {
        return new JAXBElement<CreditValidResponse>(_CreditValidResponse_QNAME, CreditValidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookItinerary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booking.service/", name = "bookItinerary")
    public JAXBElement<BookItinerary> createBookItinerary(BookItinerary value) {
        return new JAXBElement<BookItinerary>(_BookItinerary_QNAME, BookItinerary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booking.service/", name = "getTicket")
    public JAXBElement<GetTicket> createGetTicket(GetTicket value) {
        return new JAXBElement<GetTicket>(_GetTicket_QNAME, GetTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookItineraryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booking.service/", name = "bookItineraryResponse")
    public JAXBElement<BookItineraryResponse> createBookItineraryResponse(BookItineraryResponse value) {
        return new JAXBElement<BookItineraryResponse>(_BookItineraryResponse_QNAME, BookItineraryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booking.service/", name = "getTicketResponse")
    public JAXBElement<GetTicketResponse> createGetTicketResponse(GetTicketResponse value) {
        return new JAXBElement<GetTicketResponse>(_GetTicketResponse_QNAME, GetTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://booking.service/", name = "bookTicketResponse")
    public JAXBElement<BookTicketResponse> createBookTicketResponse(BookTicketResponse value) {
        return new JAXBElement<BookTicketResponse>(_BookTicketResponse_QNAME, BookTicketResponse.class, null, value);
    }

}
