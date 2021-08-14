package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final int[] PRIME_CALC_VARS = {3, 5, 6};
    private static final int RANGE = 100;

    private static String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String[] answers = new String[Engine.getAttempts()];

    public static void start() {
        Engine.start(rules, getQuestions(), answers);
    }
    static String[] getQuestions() {
        String[] questions = new String[Engine.getAttempts()];
        Random rand = new Random();
        for (int i = 0; i < questions.length; i++) {
            int temp = rand.nextInt(RANGE);
            questions[i] = Integer.toString(temp);
            calcAnswer(i, temp);
        }
        return questions;
    }

    static void calcAnswer(int index, int a) {
        boolean prime = true;
        if (a <= 1) {
            prime = false;
        } else if (a <= PRIME_CALC_VARS[0]) {
            prime = true;
        } else if (a % 2 == 0 || a % PRIME_CALC_VARS[0] == 0) {
            prime = false;
        }
        int n = PRIME_CALC_VARS[1];
        while (n * n <= a) {
            if (a % n == 0 || a % (n + 2) == 0) {
                prime = false;
            }
            n = n + PRIME_CALC_VARS[2];
        }
        answers[index] = prime ? "yes" : "no";
    }
}

