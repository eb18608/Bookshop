package com.main.java.Discount;

import com.main.java.Book;

import java.util.HashSet;

/**
 * Discount class archetype. All will offer a %discount (float) to a applicable
 * basket.
 */

public abstract class Discount implements DiscountVisitor{

    HashSet<Book> applicableBooks;

    public Discount(HashSet<Book> aB) {
        this.applicableBooks = aB;
    }
}
