package org.example;

import org.example.first.Input1;
import org.example.first.Output1;
import org.example.second.Input2;
import org.example.second.Output2;

public class Main {
    public static void main(String[] args) {
        new Input1().calculateScore("John", 25, "Male", 175, 70,
                85, 90, 75, 88, 92);
        System.out.print("\n");
        final Output1.User user = new Output1.User("John", 25, "Male", 175, 70);
        final Output1.Scores scores = new Output1.Scores(85, 90, 75, 88, 92);
        new Output1().calculateScore(user, scores);

        System.out.println("\n-------------------------------------------------------------------------------------\n");

        new Input2.User("John", 25, Input2.User.TYPE_ENGINEER, "9379992", "050").printDetails();
        System.out.println("\n");
        final Output2.Phone phone = new Output2.Phone("9379992", "050");
        new Output2.Engineer("John", 25, phone).printDetails();
    }
}
