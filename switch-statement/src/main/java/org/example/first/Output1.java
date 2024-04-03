package org.example.first;

import java.util.Scanner;

public class Output1 {

    public static abstract class Shape {
        protected Scanner input = new Scanner(System.in);

        public abstract void calculateArea();
    }

    public static class Circle extends Shape {

        @Override
        public void calculateArea() {
            System.out.print("Enter the radius of the circle: ");
            final double radius = input.nextDouble();
            final double area = Math.PI * radius * radius;
            System.out.println("Area: " + area);
        }
    }

    public static class Rectangle extends Shape {

        @Override
        public void calculateArea() {
            System.out.print("Enter the length of the rectangle: ");
            final double length = input.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            final double width = input.nextDouble();
            final double area = length * width;
            System.out.println("Area: " + area);
        }
    }

    public static class Triangle extends Shape {

        @Override
        public void calculateArea() {
            System.out.print("Enter the base of the triangle: ");
            final double base = input.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            final double height = input.nextDouble();
            final double area = 0.5 * base * height;
            System.out.println("Area: " + area);
        }
    }
}
