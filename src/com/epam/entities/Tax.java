package com.epam.entities;

/**
 * This class describe some tax.
 *
 * @author Serhii Prokopenko
 */

public class Tax implements IncomePoints {
    /**
     * Cache the code for the tax
     */
    private int taxCode;
    /**
     * Cache the name for the tax
     */
    private String taxName;
    /**
     * Keeps the value of some income for the tax calculations
     */
    private int incomeValue;
    /**
     * Keeps the real number of the rates value
     */
    private double rates;
    /**
     * Keeps the result of the tax calculations
     */
    private double taxResultValue;

    /**
     * Constructs a new tax
     *
     * @param taxCode    The tax index
     * @param taxName    The tax name
     * @param incomeValue The value of some income
     * @param rates      The tax rate
     */

    public Tax(int taxCode, String taxName, int incomeValue, double rates) {
        this.taxCode = taxCode;
        this.taxName = taxName;
        this.rates = rates;
        this.incomeValue = incomeValue;
        this.taxResultValue = getTaxResultValue();
    }

    /**
     * Calculates and returns tax value
     *
     * @return The result tax value
     */

    public double getTaxResultValue() {
        return incomeValue * rates;
    }

    /**
     * Returns a string representation of the tax.
     *
     * @return a string representation of the tax.
     */

    @Override
    public String toString() {
        return "|" + taxCode + "| " +
                taxName + "| "
                + incomeValue + "| "
                + rates + " | " +
                this.taxResultValue + " | ";
    }
}
