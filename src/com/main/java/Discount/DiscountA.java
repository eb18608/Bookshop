package com.main.java.Discount;

import com.main.java.Book;

import java.util.HashSet;

public class DiscountA extends Discount {

    float percentageDiscount;

    public DiscountA(HashSet<Book> aB, float pD) {
        super(aB);
        this.percentageDiscount = pD;
    }

    @Override
    public void visit(DiscountApplier d) {

        // Apply 10% discount to applicable books and update applier
        for (Book b: applicableBooks) {

            float newPrice = b.getPrice() * (1f - percentageDiscount);
            b.changePrice(newPrice);
        }
    }
}
