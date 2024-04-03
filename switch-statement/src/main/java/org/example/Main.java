package org.example;


import org.example.first.Input1;
import org.example.first.Output1;
import org.example.second.Input2;
import org.example.second.Output2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    /**
     * Supported shapes.
     */
    private static final Map<String, Output1.Shape> SHAPES =
            new HashMap<String, Output1.Shape>() {{
                put("circle", new Output1.Circle());
                put("rectangle", new Output1.Rectangle());
                put("triangle", new Output1.Triangle());
            }};

    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.print("Enter shape (circle, rectangle, triangle): ");
        String shapeType = input.nextLine();
        new Input1.Shape(shapeType).calculateArea();

        System.out.println("\n-------------------------------------------------------------------------------------\n");

        System.out.print("Enter shape (circle, rectangle, triangle): ");
        shapeType = input.nextLine();
        Optional.ofNullable(SHAPES.get(shapeType))
                .ifPresent(Output1.Shape::calculateArea);

        System.out.println("\n-------------------------------------------------------------------------------------\n");
        System.out.println("\n-------------------------------------------------------------------------------------\n");

        new Input2.ShapeCalculator().calculateArea("circle");

        System.out.println("\n-------------------------------------------------------------------------------------\n");

        new Output2.ShapeCalculator().calculateArea(new Output2.Circle());
    }
}
