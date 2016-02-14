package service.bank;

import service.DataControllerHandler;
import service.authentication.Authenticator;

import com.bankservice.NotAuthenticatedException_Exception;
import com.bankservice.NotAuthenticatedException;
import com.bankservice.BankService;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

/**
 * Created by peter on 2/13/16.
 */
@WebService
public class BankService_impl implements BankService{

    private AccountController accountController = DataControllerHandler.getAccountController();
    private Authenticator authenticator = new Authenticator();

    @Resource
    private WebServiceContext wsc;

    @Override
    public boolean checkAccount(int account) throws com.bankservice.NotAuthenticatedException_Exception {
        //if(validateHeader())
            return accountController.validAccount(account);
        //else throw new NotAuthenticatedException_Exception("Invalid ticket", new NotAuthenticatedException());
    }

    @Override
    public boolean withdraw(int account, float amount) throws NotAuthenticatedException_Exception {
        //if (validateHeader())
            return accountController.withdraw(account,amount);
        //else throw new NotAuthenticatedException_Exception("Invalid ticket", new NotAuthenticatedException());
    }

    private boolean validateHeader(){
        MessageContext messageContext = wsc.getMessageContext();
        Map headers = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List) headers.get("Username");
        List ticketList = (List) headers.get("Ticket");
        String username = (String) userList.get(0);
        int ticket = Integer.parseInt((String) ticketList.get(0));
        //System.out.println(username + " "+ticket);
        return authenticator.validateTicket(username,ticket);
    }
}

