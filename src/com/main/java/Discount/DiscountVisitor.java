package com.main.java.Discount;

import com.main.java.Basket;

public interface DiscountVisitor {

    void visit (DiscountVisitable d, Basket b);

}