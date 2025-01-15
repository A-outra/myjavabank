package io.codeforall.bootcamp.javabank.domain;

import io.codeforall.bootcamp.javabank.domain.account.AccountType;
import io.codeforall.bootcamp.javabank.managers.AccountManager;
import io.codeforall.bootcamp.javabank.domain.account.Account;

import java.util.HashMap;
import java.util.Map;

/**
 * The customer domain entity
 */
public class Customer {

    private AccountManager accountManager;
    private int id;
    private Map<Integer, Account> accounts = new HashMap<>();

    /**
     * Sets the account manager
     *
     * @param accountManager the account manager to set
     */
    public Customer(int id) {
        this.id = id;

    }

    public int getId (){
        return id;
    }

    public void setAccountManager(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    /**
     * Opens a new account
     *
     * @param accountType the account type to be opened
     * @return the new account id
     * @see AccountManager#openAccount(AccountType)
     */
    public int openAccount(AccountType accountType) {
        Account account = accountManager.openAccount(accountType);
        accounts.put(account.getId(), account);
        return account.getId();
    }

    /**
     * Gets the balance of an {@link Account}
     *
     * @param id the id of the account
     * @return the account balance
     */
    public double getBalance(int id) {
        System.out.println("The balance of account " + id + " is " + accounts.get(id).getBalance());
        return accounts.get(id).getBalance();
    }

    /**
     * Gets the total customer balance
     *
     * @return the customer balance
     */
    public double getBalance() {

        double balance = 0;

        for (Account account : accounts.values()) {
            //System.out.println("Account number " + );
            balance += account.getBalance();
        }
        //System.out.println("The total balance of your accounts is " + balance);
        return balance;
    }

    public Map <Integer,Account> getAccounts (){
        return accounts;
    }
}
