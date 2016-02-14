
package com.service.bank;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NotAuthenticatedException", targetNamespace = "http://www.bankservice.com")
public class NotAuthenticatedExceptionException
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
    public NotAuthenticatedExceptionException(String message, NotAuthenticatedException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public NotAuthenticatedExceptionException(String message, NotAuthenticatedException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.service.bank.NotAuthenticatedException
     */
    public NotAuthenticatedException getFaultInfo() {
        return faultInfo;
    }

}
