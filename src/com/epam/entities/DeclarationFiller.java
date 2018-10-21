package com.epam.entities;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * This class contains a static field and one static method for filling in the income declaration.
 *
 * @author Serhii Prokopenko
 */

public class DeclarationFiller {
    /**
     * The value is used as a data storage of income declaration.
     */
    private static Map<String, Integer> incomeDeclaration = fillDeclaration();
    /**
     * Fills the map and returns an income declaration
     *
     * @return  Returns map of income declaration data to the private field incomeDeclaration
     */
    private static Map <String, Integer> fillDeclaration() {
        Random rand = new Random();
        incomeDeclaration = new LinkedHashMap<>();
        for (String incomePoint: IncomePoints.incomePoints) {
            incomeDeclaration.put(incomePoint, rand.nextInt(1_000_000));
        }
        return incomeDeclaration;
    }

    /**
     * Get an income declaration
     *
     * @return  The resultant map of income declaration data
     */
    public static Map <String, Integer> getDeclaration() {
        return incomeDeclaration;
    }
}
