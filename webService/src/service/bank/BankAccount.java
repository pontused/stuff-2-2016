package service.bank;

/**
 * Created by peter on 2/13/16.
 */
public class BankAccount {

    private String name;
    private int account;
    private float balance;

    public BankAccount(String name, int account) {
        this.name = name;
        this.account = account;
        this.balance = 0;
    }

    public boolean withdraw(float amount){
        float newBalance = balance -amount;
        if (newBalance >= 0){
            balance = newBalance;
            return true;
        }else return false;
    }
    public void deposit(float amount){
        balance += amount;
    }

}
