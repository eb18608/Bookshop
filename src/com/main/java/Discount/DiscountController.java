package com.main.java.Discount;

import com.main.java.Basket;
import com.main.java.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Class to deal with the conditions needed to apply discount. Generates
 * collection of discount objects to visit DiscountApplier and affect the
 * Basket object.
 */

public class DiscountController {

    HashSet<Book> basketContents;

    public DiscountController (HashSet<Book> b) {
        this.basketContents = b;
    }

    public List<Discount> getApplicableDiscounts () {

        List<Discount> discounts = new ArrayList<Discount>();
        // Go through each discount condition functions and
        DiscountA dA = checkDiscountA(basketContents);
        if (dA != null)
            discounts.add(dA);
        else
            System.out.println("DiscountA not applicable");

        return discounts;
    }

    // Boolean functions to check if discount conditions are met.
    private DiscountA checkDiscountA (HashSet<Book> basketContents) {

        // Conditions: Books from 2010 or more recent are 10% off
        HashSet<Book> applicableBooks = new HashSet<Book>();

        for (Book b : basketContents) {
            if (b.getPublish_year() >= 2010) {
                applicableBooks.add(b);
            }
        }

        if (applicableBooks.isEmpty())
            return null;
        else
            return new DiscountA(applicableBooks);
    }
}
