package com.test.java;

import com.main.java.Basket;
import com.main.java.Book;
import com.main.java.Discount.DiscountApplier;
import com.main.java.Discount.DiscountController;
import com.main.java.DiscountCentre;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class SampleCaseTests {

    @Test
    void visitTestCaseExample1 () {
        Book b1 = new Book("The Terrible Privacy of Maxwell Sim", 2010, 13.14f);
        Book b2 = new Book("Three Men in a Boat", 1889, 12.87f);

        ArrayList<Book> testBasket = new ArrayList<>();
        testBasket.add(b1);
        testBasket.add(b2);

        Basket b = new Basket(testBasket);
        DiscountApplier dApplier = new DiscountApplier(b);
        DiscountController dController = new DiscountController(b.getBasketList());
        DiscountCentre dCentre = new DiscountCentre(dController, dApplier);

        dCentre.triggerDiscounts();

        Assert.assertEquals(24.696f, b.basketTotal(), 0.01f);

    }

    @Test
    void visitTestCaseExample2 () {
        Book b1 = new Book("Still Life With Woodpecker", 1980, 11.05f);
        Book b2 = new Book("Three Men in a Boat", 1889, 12.87f);
        Book b3 = new Book("Great Expectations", 1861, 13.21f);

        ArrayList<Book> testBasket = new ArrayList<>();
        testBasket.add(b1);
        testBasket.add(b2);
        testBasket.add(b3);

        Basket b = new Basket(testBasket);
        DiscountApplier dApplier = new DiscountApplier(b);
        DiscountController dController = new DiscountController(b.getBasketList());
        DiscountCentre dCentre = new DiscountCentre(dController, dApplier);

        dCentre.triggerDiscounts();

        Assert.assertEquals(35.27f, b.basketTotal(), 0.01f);
    }

    @Test
    void visitTestCaseExample3 () {

        Book b1 = new Book("The Terrible Privacy of Maxwell Sim", 2010, 13.14f);
        Book b2 = new Book("Three Men in a Boat", 1889, 12.87f);
        Book b3 = new Book("Great Expectations", 1861, 13.21f);

        ArrayList<Book> testBasket = new ArrayList<>();
        testBasket.add(b1);
        testBasket.add(b2);
        testBasket.add(b3);

        Basket b = new Basket(testBasket);
        DiscountApplier dApplier = new DiscountApplier(b);
        DiscountController dController = new DiscountController(b.getBasketList());
        DiscountCentre dCentre = new DiscountCentre(dController, dApplier);

        dCentre.triggerDiscounts();

        Assert.assertEquals(36.01f, b.basketTotal(), 0.01f);
    }


}