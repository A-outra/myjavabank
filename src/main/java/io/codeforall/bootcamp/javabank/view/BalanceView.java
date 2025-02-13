package io.codeforall.bootcamp.javabank.view;

import io.codeforall.bootcamp.javabank.controller.BalanceController;
import io.codeforall.bootcamp.javabank.model.Bank;
import io.codeforall.bootcamp.javabank.model.Customer;
import io.codeforall.bootcamp.javabank.model.account.Account;

import java.text.DecimalFormat;
import java.util.Set;

/**
 * A view used to show the customer balance
 * @see BalanceController
 */
public class BalanceView implements View {

    private DecimalFormat df = new DecimalFormat("#.##");
    private Bank bank;

    /**
     * Sets the bank
     *
     * @param bank the bank to set
     */
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    /**
     * @see View#show()
     */
    @Override
    public void show() {
        showBalance();
    }

    private void showBalance() {

        Customer customer = bank.getLoginCustomer();
        System.out.println("\n" + customer.getName() + Messages.VIEW_BALANCE_MESSAGE + "\n");

        Set<Account> accounts = customer.getAccounts();
        for (Account account : accounts) {
            System.out.println(account.getId() + "\t" + account.getAccountType() + "\t" + df.format(account.getBalance()));
        }

        System.out.println("\n\n" + Messages.VIEW_BALANCE_TOTAL_MESSAGE + df.format(customer.getBalance()));
    }
}
