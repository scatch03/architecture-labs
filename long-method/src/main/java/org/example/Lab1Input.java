package org.example;

import org.example.model.CartItem;

import java.util.List;

/**
 * Implementation with a long method.
 */
public class Lab1Input {

    private final List<CartItem> items;

    public Lab1Input(final List<CartItem> items) {
        this.items = items;
    }

    public void checkout(){
        double totalCost = 0;
        for (final CartItem item: items){
            totalCost += item.getAmount() * item.getPrice();
        }

        double discount = 0.1;
        if(items.size() > 5){
            discount = 0.15;
        }
        totalCost = totalCost * (1 - discount);

        double vat = 0.2;
        totalCost = totalCost * (1 + vat);

        System.out.print("Title      Amount   Price\n");
        for (final CartItem item: items){
            System.out.printf("%-15s%-5d%-5.2f\n",item.getName(), item.getAmount(), item.getPrice());
        }
        System.out.printf("\n%15sTotal:%5.2f\n", "", totalCost);
    }
}
