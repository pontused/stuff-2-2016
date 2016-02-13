
package service.flight.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.flight.com package. 
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

    private final static QName _AuthenticateResponse_QNAME = new QName("http://www.authenticator.com", "authenticateResponse");
    private final static QName _Authenticate_QNAME = new QName("http://www.authenticator.com", "authenticate");
    private final static QName _ValidateTicketResponse_QNAME = new QName("http://www.authenticator.com", "validateTicketResponse");
    private final static QName _ValidateTicket_QNAME = new QName("http://www.authenticator.com", "validateTicket");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.flight.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link ValidateTicket }
     * 
     */
    public ValidateTicket createValidateTicket() {
        return new ValidateTicket();
    }

    /**
     * Create an instance of {@link ValidateTicketResponse }
     * 
     */
    public ValidateTicketResponse createValidateTicketResponse() {
        return new ValidateTicketResponse();
    }

    /**
     * Create an instance of {@link AuthTicket }
     * 
     */
    public AuthTicket createAuthTicket() {
        return new AuthTicket();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.authenticator.com", name = "authenticateResponse")
    public JAXBElement<AuthenticateResponse> createAuthenticateResponse(AuthenticateResponse value) {
        return new JAXBElement<AuthenticateResponse>(_AuthenticateResponse_QNAME, AuthenticateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authenticate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.authenticator.com", name = "authenticate")
    public JAXBElement<Authenticate> createAuthenticate(Authenticate value) {
        return new JAXBElement<Authenticate>(_Authenticate_QNAME, Authenticate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.authenticator.com", name = "validateTicketResponse")
    public JAXBElement<ValidateTicketResponse> createValidateTicketResponse(ValidateTicketResponse value) {
        return new JAXBElement<ValidateTicketResponse>(_ValidateTicketResponse_QNAME, ValidateTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.authenticator.com", name = "validateTicket")
    public JAXBElement<ValidateTicket> createValidateTicket(ValidateTicket value) {
        return new JAXBElement<ValidateTicket>(_ValidateTicket_QNAME, ValidateTicket.class, null, value);
    }

}
