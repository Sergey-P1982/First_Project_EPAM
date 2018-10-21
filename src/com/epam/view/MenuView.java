package com.epam.view;

/**
 * The interface describes the menu fields and has one default method to display the menu.
 *
 * @author Serhii Prokopenko
 */

public interface MenuView {
    String GREETING = "Welcome to the tax calculator menu".toUpperCase();
    String SHOW_DECLARATION = "1. Show completed income declaration.";
    String CALCULATE_TAXES = "2. Calculate and show set of taxes.";
    String SORT_TAXES = "3. Sorting taxes in descending order.";
    String EXIT = "0. Exit";

    String CHOOSE_MENU_ITEM = "Choose a menu item (0-3)";
    String WRONG_NUMBER = "Wrong input. Please try again.";

    /**
     * Default interface method
     * Displays menu.
     */
    default void printMenu() {
        System.out.println(GREETING + '\n' + SHOW_DECLARATION + '\n' + CALCULATE_TAXES + '\n' + SORT_TAXES + '\n' + EXIT);

    }

}
