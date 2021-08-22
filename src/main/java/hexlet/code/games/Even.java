package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final String RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void start() {
        Engine.start(RULES, getQAndA());
    }

    static String[] getQAndA() {
        String[] qAndA = new String[Engine.ATTEMPTS * 2];
        Random rand = new Random();
        for (int i = 0; i < qAndA.length / 2; i++) {
            int temp = rand.nextInt();
            qAndA[i] = Integer.toString(temp);
            qAndA[Engine.ATTEMPTS + i] = temp % 2 == 0 ? "yes" : "no";
        }
        return qAndA;
    }
}
