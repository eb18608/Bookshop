package com.main.java.Discount;

import com.main.java.Basket;
import com.main.java.Book;

import java.util.HashSet;

public class DiscountA extends DiscountObject {

    public DiscountA(HashSet<Book> aB, float pD) {
        super(aB, pD);
    }

    @Override
    public void visit(DiscountVisitable d, Basket b) {

        // Discount logic
        System.out.println("DiscountA visiting Basket" + b.toString());
    }
}
