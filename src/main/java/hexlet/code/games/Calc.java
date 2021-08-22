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

    static String[] getQAndA() {
        String[] qAndA = new String[Engine.ATTEMPTS * 2];
        Random rand = new Random();

        for (int i = 0; i < qAndA.length / 2; i++) {
            int randOpIndex = rand.nextInt(OPERATIONS.length);
            int a = rand.nextInt(RANGE);
            int b = rand.nextInt(RANGE);
            qAndA[i] = a + " " + OPERATIONS[randOpIndex] + " " + b;

            switch (OPERATIONS[randOpIndex]) {
                case "+":
                    qAndA[Engine.ATTEMPTS + i] = Integer.toString(a + b);
                    break;
                case "-":
                    qAndA[Engine.ATTEMPTS + i] = Integer.toString(a - b);
                    break;
                case "*":
                    qAndA[Engine.ATTEMPTS + i] = Integer.toString(a * b);
                    break;
                default:
                    throw new RuntimeException("Unavailable operator");
            }
        }
        return qAndA;
    }
}
