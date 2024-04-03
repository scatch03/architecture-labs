package org.example.first;

/**
 * Implementation before refactoring.
 */
public class Input1 {

    public static class Animal {
        public void speak() {
            System.out.println("Speaking");
        }

        public void move() {
            System.out.println("Moving");
        }
    }

    public static class Dog extends Animal {
    }
}
