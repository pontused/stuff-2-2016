
package com.service.bank;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service.bank package. 
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

    private final static QName _CheckAccount_QNAME = new QName("http://bank.service/", "checkAccount");
    private final static QName _CheckAccountResponse_QNAME = new QName("http://bank.service/", "checkAccountResponse");
    private final static QName _Withdraw_QNAME = new QName("http://bank.service/", "withdraw");
    private final static QName _WithdrawResponse_QNAME = new QName("http://bank.service/", "withdrawResponse");
    private final static QName _NotAuthenticatedException_QNAME = new QName("http://www.bankservice.com", "NotAuthenticatedException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service.bank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotAuthenticatedException }
     * 
     */
    public NotAuthenticatedException createNotAuthenticatedException() {
        return new NotAuthenticatedException();
    }

    /**
     * Create an instance of {@link CheckAccount }
     * 
     */
    public CheckAccount createCheckAccount() {
        return new CheckAccount();
    }

    /**
     * Create an instance of {@link WithdrawResponse }
     * 
     */
    public WithdrawResponse createWithdrawResponse() {
        return new WithdrawResponse();
    }

    /**
     * Create an instance of {@link CheckAccountResponse }
     * 
     */
    public CheckAccountResponse createCheckAccountResponse() {
        return new CheckAccountResponse();
    }

    /**
     * Create an instance of {@link Withdraw }
     * 
     */
    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank.service/", name = "checkAccount")
    public JAXBElement<CheckAccount> createCheckAccount(CheckAccount value) {
        return new JAXBElement<CheckAccount>(_CheckAccount_QNAME, CheckAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank.service/", name = "checkAccountResponse")
    public JAXBElement<CheckAccountResponse> createCheckAccountResponse(CheckAccountResponse value) {
        return new JAXBElement<CheckAccountResponse>(_CheckAccountResponse_QNAME, CheckAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank.service/", name = "withdraw")
    public JAXBElement<Withdraw> createWithdraw(Withdraw value) {
        return new JAXBElement<Withdraw>(_Withdraw_QNAME, Withdraw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank.service/", name = "withdrawResponse")
    public JAXBElement<WithdrawResponse> createWithdrawResponse(WithdrawResponse value) {
        return new JAXBElement<WithdrawResponse>(_WithdrawResponse_QNAME, WithdrawResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotAuthenticatedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bankservice.com", name = "NotAuthenticatedException")
    public JAXBElement<NotAuthenticatedException> createNotAuthenticatedException(NotAuthenticatedException value) {
        return new JAXBElement<NotAuthenticatedException>(_NotAuthenticatedException_QNAME, NotAuthenticatedException.class, null, value);
    }

}
