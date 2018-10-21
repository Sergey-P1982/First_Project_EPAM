package com.epam.controller;

import com.epam.entities.DeclarationFiller;
import com.epam.model.TaxesCreater;
import com.epam.model.Taxes;
import com.epam.view.MenuScanner;
import com.epam.view.View;

/**
 * This is the class controller of the MVC project
 *
 * @author Serhii Prokopenko
 */
public class Controller {
    Taxes model = new Taxes();
    View view = new View();

    /**
     * Executes the main method of controller at the MVC concept
     */
    public void run() {
        model.setTaxes(TaxesCreater.getTaxes());
        String backToMenuKey = "Y";
        do {
            view.printMenu();
            executeMenuItem(MenuScanner.checkMenuItem(view, MenuScanner.scanMenuItem(view)));
            view.printMessage("Back to menu press 'Y'/ Another key to exit menu");
            backToMenuKey = MenuScanner.scanBackToMenuKey();
        } while (backToMenuKey.equalsIgnoreCase("Y"));
    }

    /**
     * Execute operations depend on number of menu item
     *
     * @param menuItem Number of menu item
     */
    private void executeMenuItem(int menuItem) {
        switch (menuItem) {
            case (1):
                view.printIncomeDeclaration(view.HEAD_OF_INCOME_DECLARATION,
                        DeclarationFiller.getDeclaration());
                break;
            case (2):
                view.printListOfTaxes(view.HEAD_OF_TAXES_SET,
                        model.getTaxes(), model.getTotalTaxes());
                break;
            case (3):
                view.printMessage(view.SORTING_TAXES);
                view.printListOfTaxes(view.HEAD_OF_TAXES_SET,
                        model.sortTaxesInDesc(), model.getTotalTaxes());
                break;
            case (0):
                view.printMessage("Bye!");
                System.exit(0);
                break;
        }
    }
}
