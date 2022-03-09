package com.main.java;

import org.junit.platform.commons.annotation.Testable;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

    public float basketTotal() {
        float i = 0;
        for (Book b : basketContents.values()) {
            i += b.getPrice();
        };

        return roundFloat(i,2);
    }

    public HashSet<Book> getBasketList () {
        HashSet<Book> currentBasketList = new HashSet<Book>();
        basketContents.values().forEach(v -> currentBasketList.add(v));
        return currentBasketList;
    }

    public HashMap<String, Book> getBasketContents () {
        return basketContents;
    }

    // Rounding helper function
    protected static float roundFloat(float f, int decimalPlaces) {

        BigDecimal bD = new BigDecimal(Float.toString(f));
        bD = bD.setScale(decimalPlaces, RoundingMode.HALF_UP);
        return bD.floatValue();
    }

}
