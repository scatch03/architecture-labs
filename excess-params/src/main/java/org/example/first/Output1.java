package org.example.first;

import java.util.Arrays;
import java.util.List;

/**
 * Implementation after refactoring.
 */
public class Output1 {

    public void calculateScore(final UserData user, final ScoresData scores) {
        user.printData();

        System.out.println("Total Score: " + scores.getTotalScore());
        System.out.println("Adult: " + user.isAdult());
    }

    public interface UserData {
        void printData();

        boolean isAdult();
    }

    public interface ScoresData {
        double getTotalScore();
    }

    public static class User implements UserData {
        private final String name;
        private final long age;
        private final String gender;
        private final double height;
        private final double weight;

        public User(final String name, final long age, final String gender, final double height, final double weight) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.height = height;
            this.weight = weight;
        }

        public boolean isAdult() {
            return this.age >= 18;
        }

        public void printData() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
        }
    }

    /**
     * Represents list of scores.
     */
    public static class Scores implements ScoresData {
        private final List<Integer> values;

        public Scores(final Integer... values) {
            this.values = Arrays.asList(values);
        }

        public double getTotalScore() {
            return values == null ? 0 : values.stream().reduce(0, Integer::sum);
        }
    }
}
