package org.example;


import org.example.first.Input1;
import org.example.first.Output1;
import org.example.second.Input2;
import org.example.second.Output2;

public class Main {

    public static void main(String[] args) {
        final Input1.Dog dog1 = new Input1.Dog();
        dog1.speak();
        dog1.move();

        System.out.println("\n-------------------------------------------------------------------------------------\n");

        final Output1.Animal animal = new Output1.Animal();
        final Output1.Dog dog2 = new Output1.Dog(animal);
        dog2.speak();
        dog2.move();

        System.out.println("\n-------------------------------------------------------------------------------------\n");
        System.out.println("\n-------------------------------------------------------------------------------------\n");

        final Input2.Square square = new Input2.Square();
        final Input2.Circle circle = new Input2.Circle();
        System.out.println("Square area= " + square.areaSquare(1));
        System.out.println("Circle area= " + circle.areaCircle(2));

        System.out.println("\n-------------------------------------------------------------------------------------\n");

        final Output2.Shape squareShape = new Output2.Square();
        final Output2.Shape circleShape = new Output2.Circle();
        System.out.println("Square area= " + squareShape.area(1));
        System.out.println("Circle area= " + circleShape.area(2));
    }
}
