package io.codeforall.bootcamp.javabank.controllers;

import io.codeforall.bootcamp.javabank.domain.Bank;
import io.codeforall.bootcamp.javabank.views.WelcomeView;

public class WelcomeController {
    Bank bank = new Bank();
    WelcomeView welcomeView = new WelcomeView(bank);

    public void start(){
        welcomeView.start();
    }
}
