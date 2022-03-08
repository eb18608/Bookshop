package com.main.java.Discount;

import com.main.java.Basket;
import com.main.java.Book;

import java.util.HashSet;

public class DiscountA extends Discount {

    public DiscountA(HashSet<Book> aB) {
        super(aB);
    }

    @Override
    public void visit(DiscountVisitable d, Basket b) {

        // Discount logic
//        System.out.println("Visitor A visits basket b: " + b.toString());
    }
}
