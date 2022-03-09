package com.main.java.Discount;

import com.main.java.Book;

import java.util.HashSet;

public class DiscountB extends Discount {

    float percentageDiscount;

    public DiscountB(HashSet<Book> aB, float pD) {
        super(aB);
        this.percentageDiscount = pD;
    }

    @Override
    public void visit(DiscountApplier d) {

        // Discount logic
        for (Book b: applicableBooks) {

            float newPrice = b.getPrice() * (1.00f - percentageDiscount);
            b.changePrice(newPrice);
        }
    }
}
