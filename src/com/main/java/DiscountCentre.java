package com.main.java;

import com.main.java.Discount.Discount;
import com.main.java.Discount.DiscountApplier;
import com.main.java.Discount.DiscountController;

import java.util.List;

/**
 * Class to run the discount system from. Abstracts complexity from runner.
 * Decouples the DiscountApplier from DiscountController.
 */

public class DiscountCentre {

    DiscountController discountController;
    DiscountApplier discountApplier;

    public DiscountCentre (DiscountController dC, DiscountApplier dA) {
        this.discountController = dC;
        this.discountApplier = dA;
    }

    private List<Discount> getDiscounts () {
        return discountController.getApplicableDiscounts();
    }

    // Runs calls to call visits from eligible discount visitors
    public void triggerDiscounts () {
        List<Discount> applicableDiscounts = getDiscounts();

        for (Discount dV: applicableDiscounts) {
            discountApplier.accept(dV);
        }
    }
}
