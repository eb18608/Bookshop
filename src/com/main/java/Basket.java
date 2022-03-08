package com.main.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Class to hold the collection of books in a hashmap. Mutable. Might not be necessary
 */

public class Basket {

    private HashMap<String, Book> basketContents;

    // Initialise basket with List of books
    public Basket (List<Book> bookList) {
        this.basketContents = new HashMap<String, Book>();
        bookList.forEach(k -> this.basketContents.put(k.getName(), k));
        System.out.println("this basket is: " + this.toString());
    }


    private float basketTotal(HashMap<String, Book> basketContents) {
        float i = 0;
        for (Book b : basketContents.values()) {
            i += b.getPrice();
        };

        return i;
    }

    public HashSet<Book> getBasketList () {
        HashSet<Book> currentBasketList = new HashSet<Book>();
        basketContents.values().forEach(v -> currentBasketList.add(v));
        return currentBasketList;
    }

    private boolean replaceEntry (Book b) {
        if (basketContents.containsKey(b.getName())) {
            if (b.getPrice() < basketContents.get(b).getPrice()) {
                basketContents.put(b.getName(), b);
                return true;
            } else
                System.err.println("Price was not cheaper");
                return false;
        } else
            throw new IllegalArgumentException("Entry was never in basket");
    }
}
