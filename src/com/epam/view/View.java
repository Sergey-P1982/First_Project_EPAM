package com.epam.view;

import com.epam.entities.Tax;

import java.util.Map;

/**
 * This is the main view class of the project
 *
 * @author Serhii Prokopenko
 */

public class View implements MenuView {

    public static final String HEAD_OF_INCOME_DECLARATION = "POINTS OF INCOME                                    UAH";
    public static final String HEAD_OF_TAXES_SET = " CODE   NAME OF THE TAX                             INCOME  RATES  RESULT TAX";
    public static final String TOTAL_TAXES = "                                                            TOTAL | ";
    public static final String SORTING_TAXES = "        SET OF TAXES AFTER SORTING IN DESCENDING ORDER";

    /**
     * Displays some information message.
     *
     * @param message The information string
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Displays one income declaration data card.
     *
     * @param message     The information string
     * @param declaration Income declaration data map
     */
    public void printIncomeDeclaration(String message, Map<String, Integer> declaration) {
        System.out.println(HEAD_OF_INCOME_DECLARATION);
        System.out.println("----------------------------------------------------------");
        int count = 1;
        for (Map.Entry<String, Integer> incomePoint : declaration.entrySet()) {
            System.out.println("|" + count + "| Annual " + incomePoint.getKey() + " | " + incomePoint.getValue() + " |");
            System.out.println("----------------------------------------------------------");
            count++;
        }

    }

    /**
     * Displays a table with a set of taxes and the total amount of all taxes
     *
     * @param message    The information string
     * @param taxes      The array of the taxes
     * @param totalTaxes Total amount of all taxes
     */
    public void printListOfTaxes(String message, Tax[] taxes, double totalTaxes) {
        System.out.println(HEAD_OF_TAXES_SET);
        System.out.println("--------------------------------------------------------------------------------");
        int count = 1;
        for (Tax tax : taxes) {
            System.out.println(tax);
            System.out.println("-------------------------------------------------------------------------------");

            count++;
        }
        System.out.println(TOTAL_TAXES + totalTaxes);

    }

}
