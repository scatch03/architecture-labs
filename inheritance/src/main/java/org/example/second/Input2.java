package org.example.second;

/**
 * Implementation before refactoring.
 */
public class Input2 {

    public static class Square {
        public double areaSquare(final double side) {
            return side * side;
        }
    }

    public static class Circle {
        public double areaCircle(final double radius) {
            return Math.PI * radius * radius;
        }
    }
}
