package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static String rules = "What number is missing in the progression?";
    private static String[] answers = new String[Engine.getAttempts()];
    private static final int RANGE = 100;
    private static final int MIN_PROGR_LENGTH = 5;


    public static void start() {
        Engine.start(rules, getQuestions(), answers);
    }

    static String[] getQuestions() {
        String[] questions = new String[Engine.getAttempts()];
        Random rand = new Random();
        for (int i = 0; i < questions.length; i++) {
            int progrLength = MIN_PROGR_LENGTH + rand.nextInt(MIN_PROGR_LENGTH);
            int step = rand.nextInt(RANGE) + 1;
            int hiddenNumber = rand.nextInt(progrLength) + 1;
            String buffer = "";
            int nextNumber = step;
            for (int j = 1; j <= progrLength; j++) {
                if (j == hiddenNumber) {
                    buffer += ".. ";
                    nextNumber += step;
                }
                buffer += nextNumber + " ";
                nextNumber += step;
            }
            questions[i] = buffer;
            calcAnswer(i, step, hiddenNumber);
        }
        return questions;
    }

    static void calcAnswer(int index, int step, int hiddenNumber) {
        answers[index] = Integer.toString(step * hiddenNumber);

    }
}
