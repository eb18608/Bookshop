package com.main.java.Discount;

import com.main.java.Basket;

/***
 * Visitable object that is coupled with the Basket object. Gets visited by
 * discount object and applies the discount to the objects in the basket's
 */


public class DiscountApplier {

    Basket basket;

    // Pass basket object to Discount Applier to modify
    public DiscountApplier(Basket b) {
        this.basket = b;
    }
}
