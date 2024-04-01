package org.example;

import org.example.model.CartItem;

import java.util.List;

/**
 * Refactored version.
 */
public class Lab1Output {

    private final List<CartItem> items;

    public Lab1Output(final List<CartItem> items) {
        this.items = items;
    }

    private double calculateRawCost(final List<CartItem> items){
        double totalCost = 0;
        for (final CartItem item: items){
            totalCost += item.getAmount() * item.getPrice();
        }
        return totalCost;
    }

    private double calculateDiscount(final List<CartItem> items){
        return items.size() > 5 ? 0.15 : 0.10;
    }

    private double calculateDiscountedCost(final double rawCost, final double discount){
        return rawCost * (1 - discount);
    }

    private double calculateWithVat(final double costBeforeVat){
        double vat = 0.2;
        return costBeforeVat * (1 + vat);
    }

    private void printCheck(final List<CartItem> items, double finalCost){
        System.out.print("Title      Amount   Price\n");
        for (final CartItem item: items){
            System.out.printf("%-15s%-5d%-5.2f\n",item.getName(), item.getAmount(), item.getPrice());
        }
        System.out.printf("\n%15sTotal:%5.2f\n", "", finalCost);
    }

    public void checkout(){
        final double rawCost = calculateRawCost(items);
        final double discount = calculateDiscount(items);
        final double discountedCost = calculateDiscountedCost(rawCost, discount);
        final double finalCost = calculateWithVat(discountedCost);

        printCheck(items, finalCost);
    }
}
