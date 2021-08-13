package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    private static String rules = "Find the greatest common divisor of given numbers.";
    private static String[] answers = new String[Engine.getAttempts()];
    private static final int RANGE = 100;

    public static void start() {
            Engine.start(rules, getQuestions(), answers);
        }

    static String[] getQuestions() {
        String[] questions = new String[Engine.getAttempts()];
        Random rand = new Random();
        for (int i = 0; i < questions.length; i++) {
            int a = rand.nextInt(RANGE) + 1;
            int b = rand.nextInt(RANGE) + 1;
            questions[i] = a + " " + b;
            calcAnswer(i, a, b);
        }
        return questions;
    }

    static void calcAnswer(int index, int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for (int i = min; i > 0; i--) {
            if ((max % i == 0) && (min % i == 0)) {
                answers[index] = Integer.toString(i);
                break;
            }
        }
    }
}
