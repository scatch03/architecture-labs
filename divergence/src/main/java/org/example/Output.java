package org.example;

/**
 * Implementation before refactoring.
 */
public class Output {

    public static class Product {
        private final String name;
        private final double price;
        private final String type;

        private final ProductSearchStrategy searchStrategy;

        private final ProductOrderingStrategy orderingStrategy;

        public Product(final String name,
                       final double price,
                       final String type,
                       final ProductSearchStrategy searchStrategy,
                       final ProductOrderingStrategy orderingStrategy) {
            this.name = name;
            this.price = price;
            this.type = type;
            this.searchStrategy = searchStrategy;
            this.orderingStrategy = orderingStrategy;
        }

        public void searchProduct(final String query) {
            searchStrategy.searchProduct(query);
        }

        public void orderProduct() {
            orderingStrategy.orderProduct(this);
        }

        public void displayProduct() {
            System.out.printf("Product[%s; %6.2f; %s]\n", name, price, type);
        }
    }

    public interface ProductSearchStrategy {
        void searchProduct(String query);
    }

    public static class SimpleProductSearch implements ProductSearchStrategy {

        public void searchProduct(final String query) {
            System.out.println("Searching product by query: " + query);
        }
    }

    public interface ProductOrderingStrategy {
        void orderProduct(Product product);
    }

    public static class SimpleProductOrdering implements ProductOrderingStrategy {
        public void orderProduct(final Product product) {
            System.out.print("Ordered product: ");
            product.displayProduct();
        }
    }
}
