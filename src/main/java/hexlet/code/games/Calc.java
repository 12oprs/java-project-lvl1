package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public class Calc {
    private static final int RANGE = 100;
    private static final String RULES = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};

    public static void start() {
        Engine.start(RULES, getQAndA());
    }

    static String[][] getQAndA() {
        String[][] qAndA = new String[2][Engine.ATTEMPTS];
        Random rand = new Random();

        for (int i = 0; i < qAndA[0].length; i++) {
            int randOpIndex = rand.nextInt(OPERATIONS.length);
            int a = rand.nextInt(RANGE);
            int b = rand.nextInt(RANGE);
            qAndA[0][i] = a + " " + OPERATIONS[randOpIndex] + " " + b;
            getAnswers(i, randOpIndex, a, b, qAndA);
        }
        return qAndA;
    }

    static String[][] getAnswers(int i, int randOpIndex, int a, int b, String[][] qAndA) {
        switch (OPERATIONS[randOpIndex]) {
            case "+":
                qAndA[1][i] = Integer.toString(a + b);
                break;
            case "-":
                qAndA[1][i] = Integer.toString(a - b);
                break;
            case "*":
                qAndA[1][i] = Integer.toString(a * b);
                break;
            default:
                throw new RuntimeException("Unavailable operator");
        }
        return qAndA;
    }
}
