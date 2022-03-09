package com.main.java;

import com.main.java.Discount.DiscountA;
import com.main.java.Discount.DiscountApplier;
import com.main.java.Discount.DiscountController;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        Book b1 = new Book("Moby Dick", 1851, 15.20f);
        Book b2 = new Book("The Terrible Privacy of Maxwell Sim", 2010, 13.14f);
        Book b3 = new Book("Three Men in a Boat", 1889, 12.87f);
        ArrayList<Book> basket = new ArrayList<>();
//        basket.add(b1);
        basket.add(b2);
        basket.add(b3);
        Basket b = new Basket(basket);
        DiscountApplier dApplier = new DiscountApplier(b);
        DiscountController dController = new DiscountController(b.getBasketList());
        DiscountCentre dCentre = new DiscountCentre(dController, dApplier);
        dCentre.triggerDiscounts();

        System.out.println(b.basketTotal());
    }
}
