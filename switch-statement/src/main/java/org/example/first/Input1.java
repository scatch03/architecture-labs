package org.example.first;

import java.util.Scanner;

public class Input1 {

    public static class Shape {
        private final String shapeType;

        public Shape(final String shapeType) {
            this.shapeType = shapeType;
        }

        public void calculateArea(){
            double area = 0;

            final Scanner input = new Scanner(System.in);
            if ("circle".equals(shapeType)){
                System.out.print("Enter the radius of the circle: ");
                double radius = input.nextDouble();
                area = Math.PI * radius * radius;
            } else if ("rectangle".equals(shapeType)) {
                System.out.print("Enter the length of the rectangle: ");
                double length = input.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = input.nextDouble();
                area = length * width;
            } else if ("triangle".equals(shapeType)){
                System.out.print("Enter the base of the triangle: ");
                double base = input.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = input.nextDouble();
                area = 0.5 * base * height;
            }

            System.out.println("Area: " + area);
        }
    }
}
