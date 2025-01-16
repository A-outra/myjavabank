package io.codeforall.bootcamp.javabank.controllers;

import io.codeforall.bootcamp.javabank.domain.Bank;
import io.codeforall.bootcamp.javabank.views.MenuView;

public class MenuController {
    Bank bank = new Bank();
    MenuView menuView = new MenuView(bank);

    public void start(){
        menuView.menuLoop();
    }
}
