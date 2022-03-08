package com.main.java.Discount;

import com.main.java.Basket;
import com.main.java.Book;

import java.util.HashSet;

public class DiscountB extends Discount {


    public DiscountB(HashSet<Book> aB) {
        super(aB);
    }

    @Override
    public void visit(DiscountVisitable d, Basket b) {

        // Discount logic
        System.out.println("Visitor B visits basket b: " + b.toString());
    }
}
