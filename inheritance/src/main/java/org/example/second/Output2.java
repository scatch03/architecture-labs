package org.example.second;

/**
 * Implementation after refactoring.
 */
public class Output2 {

    public interface Shape {
        double area(double dimension);
    }

    public static class Square implements Shape {
        public double area(final double side) {
            return side * side;
        }
    }

    public static class Circle implements Shape {
        public double area(final double radius) {
            return Math.PI * radius * radius;
        }
    }
}
