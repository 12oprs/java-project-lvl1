package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};

    public static void start() {
        Engine.start(RULES, getQAndA());
    }

    static String[][] getQAndA() {
        String[][] qAndA = new String[2][Engine.ATTEMPTS];

        for (int i = 0; i < qAndA[0].length; i++) {
            int randOpIndex = Utils.getRandomValue(OPERATIONS.length);
            int a = Utils.getRandomValue();
            int b = Utils.getRandomValue();
            qAndA[0][i] = a + " " + OPERATIONS[randOpIndex] + " " + b;
            getAnswers(i, randOpIndex, a, b, qAndA);
        }
        return qAndA;
    }

    static String[][] getAnswers(int i, int randOpIndex, int a, int b, String[][] qAndA) {
        switch (OPERATIONS[randOpIndex]) {
            case "+" -> {
                qAndA[1][i] = Integer.toString(a + b);
            }
            case "-" -> {
                qAndA[1][i] = Integer.toString(a - b);
            }
            case "*" -> {
                qAndA[1][i] = Integer.toString(a * b);
            }
            default -> throw new RuntimeException("Unavailable operator");
        }
        return qAndA;
    }
}
