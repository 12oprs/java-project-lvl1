package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void start() {
        Engine.start(RULES, getQAndA());
    }

    static String[][] getQAndA() {
        String[][] qAndA = new String[2][Engine.ATTEMPTS];
        for (int i = 0; i < qAndA[0].length; i++) {
            int a = Utils.getRandomValue() + 1;
            int b = Utils.getRandomValue() + 1;
            qAndA[0][i] = a + " " + b;
            getAnswers(i, a, b, qAndA);

        }
        return qAndA;
    }

    static String[][] getAnswers(int i, int a, int b, String[][] qAndA) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for (int j = Math.min(a, b); j > 0; j--) {
            if ((max % j == 0) && (min % j == 0)) {
                qAndA[1][i] = Integer.toString(j);
                break;
            }
        }
        return qAndA;
    }
}
