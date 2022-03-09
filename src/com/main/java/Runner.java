package com.main.java;


import com.main.java.Discount.DiscountApplier;
import com.main.java.Discount.DiscountController;

import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Book> basket = new ArrayList<>();
        String filepath = args[0];
        try {
            File f = new File(filepath);
            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] elems = line.split(",");
                Book b = new Book(elems[0], Integer.parseInt(elems[1]), Float.parseFloat(elems[2]));
                basket.add(b);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }


        Basket b = new Basket(basket);
        DiscountApplier dApplier = new DiscountApplier(b);
        DiscountController dController = new DiscountController(b.getBasketList());
        DiscountCentre dCentre = new DiscountCentre(dController, dApplier);
        dCentre.triggerDiscounts();

        System.out.println(b.basketTotal());
    }
}
