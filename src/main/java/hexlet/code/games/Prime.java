package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int[] PRIME_CALC_VARS = {3, 5, 6};
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        Engine.start(RULES, getQAndA());
    }

    static String[][] getQAndA() {
        String[][] qAndA = new String[2][Engine.ATTEMPTS];
        for (int i = 0; i < qAndA[0].length; i++) {
            int temp = Utils.getRandomValue();
            qAndA[0][i] = Integer.toString(temp);
            qAndA[1][i] = getAnswer(qAndA[0][i]);
        }
        return qAndA;
    }

    static String getAnswer(String question) {
        int temp = Integer.parseInt(question);
        boolean prime = true;
        if (temp <= 1) {
            prime = false;
        } else if (temp <= PRIME_CALC_VARS[0]) {
            prime = true;
        } else if (temp % 2 == 0 || temp % PRIME_CALC_VARS[0] == 0) {
            prime = false;
        }
        int n = PRIME_CALC_VARS[1];
        while (n * n <= temp) {
            if (temp % n == 0 || temp % (n + 2) == 0) {
                prime = false;
            }
            n = n + PRIME_CALC_VARS[2];
        }
        return prime ? "yes" : "no";
    }
}

