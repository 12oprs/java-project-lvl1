package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public class Calc {

    private static String rules = "What is the result of the expression?";
    private static String[] answers = new String[Engine.getAttempts()];
    private static final int RANGE = 100;

    public static void start() {
        Engine.start(rules, getQuestions(), answers);
    }

    static String[] getQuestions() {
        String[] questions = new String[Engine.getAttempts()];
        Random rand = new Random();
        String[] operation = {"+", "-", "*"};
        for (int i = 0; i < questions.length; i++) {
            int randOpIndex = rand.nextInt(operation.length);
            Integer a = rand.nextInt(RANGE);
            Integer b = rand.nextInt(RANGE);
            questions[i] = a.toString() + " " + operation[randOpIndex] + " " + b.toString();
            calcAnswer(i, a, b, operation[randOpIndex]);
        }
        return questions;
    }

    static void calcAnswer(int index, int a, int b, String operation) {
        switch (operation) {
            case "+":
                answers[index] = Integer.toString(a + b);
                break;
            case "-":
                answers[index] = Integer.toString(a - b);
                break;
            case "*":
                answers[index] = Integer.toString(a * b);
                break;
            default:
                break;
        }
    }

}
