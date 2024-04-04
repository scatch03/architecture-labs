package org.example;

/**
 * Implementation before refactoring.
 */
public class Input {

    public static class Product {
        private final String name;
        private final double price;
        private final String type;

        public Product(final String name, final double price, final String type) {
            this.name = name;
            this.price = price;
            this.type = type;
        }

        public void searchProduct(final String query) {
            System.out.println("Searching product by query: " + query);
        }

        public void displayProduct() {
            System.out.printf("Product[%s; %6.2f; %s]\n", name, price, type);
        }

        public void orderProduct() {
            System.out.print("Ordered product: ");
            displayProduct();
        }
    }
}
