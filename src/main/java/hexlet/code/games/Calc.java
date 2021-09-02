package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

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
            qAndA[1][i] = getAnswer(qAndA[0][i]);

        }
        return qAndA;
    }

    static String getAnswer(String question) {
        String answer = new String;
        String operator = question.split(" ")[1];
        int a = Integer.parseInt(question.split(" ")[0]);
        int b = Integer.parseInt(question.split(" ")[2]);
        switch (operator) {
            case "+" -> {
                answer = Integer.toString(a + b);
            }
            case "-" -> {
                answer = Integer.toString(a - b);
            }
            case "*" -> {
                answer = Integer.toString(a * b);
            }
            default -> throw new RuntimeException("Unavailable operator");
        }
        return answer;
    }
}
