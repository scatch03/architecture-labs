package org.example.first;

/**
 * Implementation before refactoring.
 */
public class Input1 {

    public void calculateScore(final String name,
                               final long age,
                               final String gender,
                               final double height,
                               final double weight,
                               final double score1,
                               final double score2,
                               final double score3,
                               final double score4,
                               final double score5) {
        final double totalScore = score1 + score2 + score3 + score4 + score5;
        final boolean isAdult = age >= 18;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Adult: " + isAdult);
    }
}
