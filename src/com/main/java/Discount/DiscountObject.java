package com.main.java.Discount;

import com.main.java.Book;

import java.util.HashSet;

/**
 * Discount class archetype. All will offer a %discount (float) to a applicable
 * basket.
 */

public abstract class DiscountObject implements DiscountVisitor{

    HashSet<Book> applicableBooks;
    float percentageDiscount;

    public DiscountObject (HashSet<Book> aB, float pD) {
        this.applicableBooks = aB;
        this.percentageDiscount = pD;
    }
}
