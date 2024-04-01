package org.example.model;

/**
 * Shopping cart item.
 */
public class CartItem {
    private final String name;
    private final long amount;
    private final double price;

    public CartItem(final String name, final long amount, final double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }
}
