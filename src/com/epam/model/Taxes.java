package com.epam.model;

import com.epam.entities.Tax;

import java.util.Arrays;

/**
 * This class contains one field with array of taxes.
 *
 * @author Serhii Prokopenko
 */

public class Taxes<T> {
    private Tax[] taxes;
 /**
 * @param  taxes
 *         The initial values of the array of taxes
 */
    public void setTaxes(Tax[] taxes) {
        this.taxes = taxes;
    }
    /**
     * Gets and returns the array of taxes
     *
     * @return The resultant array of taxes
     */
    public Tax[] getTaxes() {
        return taxes;
    }

    /**
     * Calculates and returns the total amount of all taxes from the array.
     *
     * @return Total amount of all taxes
     */
    public double getTotalTaxes() {
        double totalTaxes = 0;
        for (int i = 0; i < taxes.length; i++) {
            totalTaxes += taxes[i].getTaxResultValue();
        }
        return totalTaxes;
    }
    /**
     * Sorts and returns the array of taxes.
     *
     * @return The resultant sorted array of taxes
     */

    public Tax[] sortTaxesInDesc() {
        Tax[] temp = TaxesCreater.getTaxes();
        Arrays.sort(temp, new TaxComparator<Tax>());
        return temp;
    }
}
