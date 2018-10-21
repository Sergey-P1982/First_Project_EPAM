package com.epam.model;

import com.epam.entities.DeclarationFiller;
import com.epam.entities.Tax;

import java.util.Map;

/**
 * This class has only one static method of filling in an array of taxes, using data from the income declaration.
 *
 * @author Serhii Prokopenko
 */

public class TaxesCreater<T> {

    /**
     * Creates and returns the array of taxes
     *
     * @return The resultant array of taxes
     */
    public static Tax[] getTaxes() {
        Tax[] taxes = new Tax[DeclarationFiller.getDeclaration().size()];
        int count = 0;
        if (taxes != null ) {
            for (Map.Entry<String, Integer> incomePoint : DeclarationFiller.getDeclaration().entrySet()) {
                String taxName = "Tax of " + incomePoint.getKey();
                int incomValue = incomePoint.getValue();
                taxes[count] = new Tax(count+1001 ,taxName, incomValue, 0.18);
                count++;
            }
        }
        return taxes;
    }

}
