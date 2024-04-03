package org.example.first;

/**
 * Implementation after refactoring.
 */
public class Output1 {

    public interface Behaviour {
        void speak();

        void move();
    }

    public static class Animal implements Behaviour {
        public void speak() {
            System.out.println("Speaking");
        }

        public void move() {
            System.out.println("Moving");
        }
    }

    public static class Dog implements Behaviour {
        private final Behaviour behaviour;

        public Dog(final Behaviour behaviour) {
            this.behaviour = behaviour;
        }

        public void speak() {
            behaviour.speak();
        }

        public void move() {
            behaviour.move();
        }
    }
}
