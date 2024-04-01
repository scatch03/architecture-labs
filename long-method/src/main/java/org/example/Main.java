package org.example;

import org.example.model.CartItem;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(final String[] args) {
        final List<CartItem> items = Arrays.asList(
                new CartItem("Soap", 2, 1.09),
                new CartItem("Shampoo", 1, 3.19),
                new CartItem("Cream", 1, 1.19),
                new CartItem("Conditioner", 1, 2.29)
        );

        new Lab1Input(items).checkout();
        System.out.println("\n");
        new Lab1Output(items).checkout();
    }
}
