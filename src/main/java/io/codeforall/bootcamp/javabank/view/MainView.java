package io.codeforall.bootcamp.javabank.view;

import io.codeforall.bootcamp.javabank.controller.MainController;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

/**
 * A view used to display the main menu
 *
 * @see MainController
 */
public class MainView extends AbstractView {

    private MainController mainController;

    /**
     * Sets the controller responsible for rendering the view
     *
     * @param mainController the controller to set
     */
    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    /**
     * @see View#show()
     */
    @Override
    public void show() {
        showMenu();
    }

    private void showMenu() {

        MenuInputScanner scanner = new MenuInputScanner(UserOptions.getMessages());
        scanner.setError(Messages.VIEW_MAIN_ERROR);
        scanner.setMessage("\n" + Messages.VIEW_MAIN_MESSAGE + bank.getLoginCustomer().getName());
        mainController.onMenuSelection(prompt.getUserInput(scanner));
    }
}
