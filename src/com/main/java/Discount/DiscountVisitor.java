package com.main.java.Discount;

import com.main.java.Basket;

public interface DiscountVisitor {
    public void visit (DiscountVisitable d, Basket b);
}
