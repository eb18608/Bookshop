package com.main.java;

/**
 * Book object containing all relevant information
 */

public class Book {
    private String name;
    private int publish_year;
    private float price;

    public Book(String name, int publish_year, float price) {
        this.name = name;
        this.publish_year = publish_year;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPublish_year() {
        return publish_year;
    }

    public float getPrice() {
        return price;
    }

    public void changePrice(float newPrice) {
        this.price = newPrice;
    }
}