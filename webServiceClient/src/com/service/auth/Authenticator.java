
package com.service.auth;

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
@WebService(name = "Authenticator", targetNamespace = "http://authentication.service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Authenticator {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.service.auth.AuthTicket
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authenticate", targetNamespace = "http://authentication.service/", className = "com.service.auth.Authenticate")
    @ResponseWrapper(localName = "authenticateResponse", targetNamespace = "http://authentication.service/", className = "com.service.auth.AuthenticateResponse")
    @Action(input = "http://authentication.service/Authenticator/authenticateRequest", output = "http://authentication.service/Authenticator/authenticateResponse")
    public AuthTicket authenticate(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validateTicket", targetNamespace = "http://authentication.service/", className = "com.service.auth.ValidateTicket")
    @ResponseWrapper(localName = "validateTicketResponse", targetNamespace = "http://authentication.service/", className = "com.service.auth.ValidateTicketResponse")
    @Action(input = "http://authentication.service/Authenticator/validateTicketRequest", output = "http://authentication.service/Authenticator/validateTicketResponse")
    public boolean validateTicket(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}