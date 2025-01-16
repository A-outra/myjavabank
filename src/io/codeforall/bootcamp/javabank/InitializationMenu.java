package io.codeforall.bootcamp.javabank;

import io.codeforall.bootcamp.javabank.controllers.*;
import io.codeforall.bootcamp.javabank.domain.Bank;
import io.codeforall.bootcamp.javabank.views.*;

public class InitializationMenu {
    public void start(){
        Bank bank = new Bank();
        BalanceView balanceView = new BalanceView(bank);
        DepositView depositView = new DepositView(bank);
        MenuView menuView = new MenuView(bank);
        OpenAccountView openAccountView = new OpenAccountView(bank);
        QuitView quitView = new QuitView(bank);
        WelcomeView welcomeView = new WelcomeView(bank);
        WithdrawalView withdrawalView = new WithdrawalView(bank);
        BalanceController balanceController = new BalanceController();
        DepositController depositController = new DepositController();
        MenuController menuController = new MenuController();
        OpenAccountController openAccountController = new OpenAccountController();
        QuitController quitController = new QuitController();
        WelcomeController welcomeController = new WelcomeController();
        WithdrawalController withdrawalController = new WithdrawalController();
    }
}
