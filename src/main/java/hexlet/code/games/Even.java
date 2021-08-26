package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final String RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void start() {
        Engine.start(RULES, getQAndA());
    }

    static String[][] getQAndA() {
        String[][] qAndA = new String[2][Engine.ATTEMPTS];
        Random rand = new Random();
        for (int i = 0; i < qAndA[0].length; i++) {
            int temp = rand.nextInt();
            qAndA[0][i] = Integer.toString(temp);
            qAndA[1][i] = temp % 2 == 0 ? "yes" : "no";
        }
        return qAndA;
    }
}
