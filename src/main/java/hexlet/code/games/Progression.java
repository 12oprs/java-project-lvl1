package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final int RANGE = 100;
    private static final int MIN_PROGR_LENGTH = 5;
    private static final String RULES = "What number is missing in the progression?";

    public static void start() {
        Engine.start(RULES, getQAndA());
    }

    static String[][] getQAndA() {
        String[][] qAndA = new String[2][Engine.ATTEMPTS];
        Random rand = new Random();
        for (int i = 0; i < qAndA[0].length(); i++) {
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
            qAndA[0][i] = buffer;

            qAndA[1][i] = Integer.toString(step * hiddenNumber);
        }
        return qAndA;
    }
}
