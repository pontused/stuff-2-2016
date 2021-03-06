
package com.service.bank;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankService_impl", targetNamespace = "http://bank.service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankServiceImpl {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws NotAuthenticatedExceptionException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "withdraw", targetNamespace = "http://bank.service/", className = "com.service.bank.Withdraw")
    @ResponseWrapper(localName = "withdrawResponse", targetNamespace = "http://bank.service/", className = "com.service.bank.WithdrawResponse")
    @Action(input = "http://bank.service/BankService_impl/withdrawRequest", output = "http://bank.service/BankService_impl/withdrawResponse", fault = {
        @FaultAction(className = NotAuthenticatedExceptionException.class, value = "http://bank.service/BankService_impl/withdraw/Fault/NotAuthenticatedException_Exception")
    })
    public boolean withdraw(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1)
        throws NotAuthenticatedExceptionException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     * @throws NotAuthenticatedExceptionException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkAccount", targetNamespace = "http://bank.service/", className = "com.service.bank.CheckAccount")
    @ResponseWrapper(localName = "checkAccountResponse", targetNamespace = "http://bank.service/", className = "com.service.bank.CheckAccountResponse")
    @Action(input = "http://bank.service/BankService_impl/checkAccountRequest", output = "http://bank.service/BankService_impl/checkAccountResponse", fault = {
        @FaultAction(className = NotAuthenticatedExceptionException.class, value = "http://bank.service/BankService_impl/checkAccount/Fault/NotAuthenticatedException_Exception")
    })
    public boolean checkAccount(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws NotAuthenticatedExceptionException
    ;

}
