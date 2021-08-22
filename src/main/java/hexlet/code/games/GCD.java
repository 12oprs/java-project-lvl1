package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final int RANGE = 100;
    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void start() {
        Engine.start(RULES, getQAndA());
    }

    static String[] getQAndA() {
        String[] qAndA = new String[Engine.ATTEMPTS * 2];
        Random rand = new Random();
        for (int i = 0; i < qAndA.length / 2; i++) {
            int a = rand.nextInt(RANGE) + 1;
            int b = rand.nextInt(RANGE) + 1;
            qAndA[i] = a + " " + b;

            int min = Math.min(a, b);
            int max = Math.max(a, b);
            for (int j = Math.min(a, b); j > 0; j--) {
                if ((max % j == 0) && (min % j == 0)) {
                    qAndA[Engine.ATTEMPTS + i] = Integer.toString(j);
                    break;
                }
            }
        }
        return qAndA;
    }
}
