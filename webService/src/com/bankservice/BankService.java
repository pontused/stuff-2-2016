
package com.bankservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankService", targetNamespace = "http://www.bankservice.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankService {


    /**
     * 
     * @param amount
     * @param account
     * @return
     *     returns boolean
     * @throws NotAuthenticatedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "withdraw", targetNamespace = "http://www.bankservice.com", className = "com.bankservice.Withdraw")
    @ResponseWrapper(localName = "withdrawResponse", targetNamespace = "http://www.bankservice.com", className = "com.bankservice.WithdrawResponse")
    public boolean withdraw(
        @WebParam(name = "account", targetNamespace = "")
        int account,
        @WebParam(name = "amount", targetNamespace = "")
        float amount)
        throws NotAuthenticatedException_Exception
    ;

    /**
     * 
     * @param account
     * @return
     *     returns boolean
     * @throws NotAuthenticatedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkAccount", targetNamespace = "http://www.bankservice.com", className = "com.bankservice.CheckAccount")
    @ResponseWrapper(localName = "checkAccountResponse", targetNamespace = "http://www.bankservice.com", className = "com.bankservice.CheckAccountResponse")
    public boolean checkAccount(
        @WebParam(name = "account", targetNamespace = "")
        int account)
        throws NotAuthenticatedException_Exception
    ;

}