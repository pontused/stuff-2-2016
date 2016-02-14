package service.bank;

import java.util.HashMap;

/**
 * Created by peter on 2/13/16.
 */
public class AccountController {

    HashMap<Integer,BankAccount> bankAccounts = new HashMap<Integer, BankAccount>();

    public AccountController(){
        genAccounts();
    }
    private void genAccounts(){
        bankAccounts.put(1234,new BankAccount("peter",1234));
        bankAccounts.get(1234).deposit(4000);
    }
    public boolean validAccount(int account){
        return bankAccounts.containsKey(account);
    }
    public boolean withdraw(int account, float amount){
        if (validAccount(account)){
            return bankAccounts.get(account).withdraw(amount);
        }else return false;
    }
}
