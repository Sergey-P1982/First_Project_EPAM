package com.epam.entities;

/**
 * This is an interface with an array of strings containing some items of income.
 *
 * @author Serhii Prokopenko
 */
public interface IncomePoints<T> {
    /**
     * The value is used as a strings storage.
     */
    String[] incomePoints = {"income from the main place of work   ",
            "income from additional employment    ",
            "author's remunerations               ",
            "income from the sale of property     ",
            "receiving a gift in cash and property",
            "receiving transfers from abroad      ",
            "use of child benefits                ",
            "receiving financial assistance       "};

}
