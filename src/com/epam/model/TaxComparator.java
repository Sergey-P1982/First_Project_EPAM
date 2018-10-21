package com.epam.model;

import com.epam.entities.Tax;

import java.util.Comparator;

/**
 * This class has an override method that compares two values of real numbers in the decreasing order.
 * regular expressions..
 *
 * @author Serhii Prokopenko
 */

public class TaxComparator<T> implements Comparator<T> {

    /**
     * Compares its two arguments for order.
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     * first argument is less than, equal to, or greater than the
     * second.
     */
    @Override
    public int compare(Object o1, Object o2) {
        Double taxValue1 = ((Tax) o1).getTaxResultValue();
        Double taxValue2 = ((Tax) o2).getTaxResultValue();
        return taxValue2.compareTo(taxValue1);
    }
}

