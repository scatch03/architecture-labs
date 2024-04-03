package org.example.second;

import java.util.Scanner;

public class Input2 {

    public static class ShapeCalculator {
        private final Scanner input = new Scanner(System.in);

        public void calculateArea(final String shapeType){
            if ("circle".equals(shapeType)) {
                calculateCircleArea();
            } else if ("rectangle".equals(shapeType)){
                calculateRectangleArea();
            } else if ("triangle".equals(shapeType)) {
                calculateTriangleArea();
            }
        }

        private void calculateCircleArea() {
            System.out.print("Enter the radius of the circle: ");
            final double radius = input.nextDouble();
            final double area = Math.PI * radius * radius;
            System.out.println("Area: " + area);
        }

        private void calculateRectangleArea() {
            System.out.print("Enter the length of the rectangle: ");
            final double length = input.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            final double width = input.nextDouble();
            final double area = length * width;
            System.out.println("Area: " + area);
        }

        private void calculateTriangleArea() {
            System.out.print("Enter the base of the triangle: ");
            final double base = input.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            final double height = input.nextDouble();
            final double area = 0.5 * base * height;
            System.out.println("Area: " + area);
        }
    }
}
