package com.main.java.Discount;

import com.main.java.Basket;
import com.main.java.Book;

import java.util.HashSet;

/**
 * Class to deal with the conditions needed to apply discount. Generates discount visitor
 * objects to visit the discount applier that applies the discount.
 */

public class DiscountController {

    HashSet<Book> basketContents;

    public DiscountController (HashSet<Book> b) {
        this.basketContents = b;
    }

    // Boolean functions to check if discount conditions are met.

}
