
package service.itinerary.com.flight;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NotAuthenticatedException", targetNamespace = "http://www.flightservice.com")
public class NotAuthenticatedException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NotAuthenticatedException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public NotAuthenticatedException_Exception(String message, NotAuthenticatedException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public NotAuthenticatedException_Exception(String message, NotAuthenticatedException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: service.itinerary.com.flight.NotAuthenticatedException
     */
    public NotAuthenticatedException getFaultInfo() {
        return faultInfo;
    }

}
