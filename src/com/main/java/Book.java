package com.main.java;

/**
 * Book object containing all relevant information
 */

public class Book {
    String name;
    float publish_year;
    float price;

    public Book(String name, float publish_year, float price) {
        this.name = name;
        this.publish_year = publish_year;
        this.price = price;

    }

    private String getName(){
        return name;
    }

    private void changePrice(int newPrice) {
        this.price = newPrice;
    }
}
