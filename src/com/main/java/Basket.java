package com.main.java;

import java.util.HashMap;
import java.util.List;

/**
 * Class to hold the collection of books in a hashmap. Mutable. Might not be necessary
 */

public class Basket {

    HashMap<String, Book> basketContents;

    // Initialise basket with List of books
    public Basket (List<Book> bookList) {
        bookList.forEach(k -> this.basketContents.put(k.name, k));
    }


    private float basketTotal(HashMap<String, Book> basketContents) {
        float i = 0;
        for (Book b : basketContents.values()) {
            i += b.price;
        };

        return i;
    }

    private boolean replaceEntry (Book b) {
        if (basketContents.containsKey(b.name)) {
            if (b.price < basketContents.get(b).price) {
                basketContents.put(b.name, b);
                return true;
            } else
                System.err.println("Price was not cheaper");
                return false;
        } else
            throw new IllegalArgumentException("Entry was never in basket");
    }
}
