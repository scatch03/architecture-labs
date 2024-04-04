package org.example;


public class Main {

    public static void main(final String[] args) {
        final Input.Product product1 = new Input.Product("Safeguard", 1.99, "Soap");
        product1.displayProduct();
        product1.searchProduct("Soap");
        product1.orderProduct();

        System.out.println("\n-------------------------------------------------------------------------------------\n");

        final Output.ProductSearchStrategy search = new Output.SimpleProductSearch();
        final Output.ProductOrderingStrategy order = new Output.SimpleProductOrdering();
        final Output.Product product2 = new Output.Product("Safeguard", 1.99, "Soap", search, order);
        product2.displayProduct();
        product2.searchProduct("Soap");
        product2.orderProduct();
    }
}
