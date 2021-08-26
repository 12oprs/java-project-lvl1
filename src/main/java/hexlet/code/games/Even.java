package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void start() {
        Engine.start(RULES, getQAndA());
    }

    static String[][] getQAndA() {
        String[][] qAndA = new String[2][Engine.ATTEMPTS];
        for (int i = 0; i < qAndA[0].length; i++) {
            int temp = Utils.getRandomValue();
            qAndA[0][i] = Integer.toString(temp);
            qAndA[1][i] = temp % 2 == 0 ? "yes" : "no";
        }
        return qAndA;
    }
}
