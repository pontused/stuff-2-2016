
package com.authenticator;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Authenticator", targetNamespace = "http://www.authenticator.com", wsdlLocation = "file:/C:/Users/Pontus/Documents/GitHub/stuff-2-2016/webService/src/test2.wsdl")
public class Authenticator_Service
    extends Service
{

    private final static URL AUTHENTICATOR_WSDL_LOCATION;
    private final static WebServiceException AUTHENTICATOR_EXCEPTION;
    private final static QName AUTHENTICATOR_QNAME = new QName("http://www.authenticator.com", "Authenticator");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Pontus/Documents/GitHub/stuff-2-2016/webService/src/test2.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AUTHENTICATOR_WSDL_LOCATION = url;
        AUTHENTICATOR_EXCEPTION = e;
    }

    public Authenticator_Service() {
        super(__getWsdlLocation(), AUTHENTICATOR_QNAME);
    }

    public Authenticator_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), AUTHENTICATOR_QNAME, features);
    }

    public Authenticator_Service(URL wsdlLocation) {
        super(wsdlLocation, AUTHENTICATOR_QNAME);
    }

    public Authenticator_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AUTHENTICATOR_QNAME, features);
    }

    public Authenticator_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Authenticator_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Authenticator
     */
    @WebEndpoint(name = "AuthenticatorPort")
    public Authenticator getAuthenticatorPort() {
        return super.getPort(new QName("http://www.authenticator.com", "AuthenticatorPort"), Authenticator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Authenticator
     */
    @WebEndpoint(name = "AuthenticatorPort")
    public Authenticator getAuthenticatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.authenticator.com", "AuthenticatorPort"), Authenticator.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AUTHENTICATOR_EXCEPTION!= null) {
            throw AUTHENTICATOR_EXCEPTION;
        }
        return AUTHENTICATOR_WSDL_LOCATION;
    }

}
