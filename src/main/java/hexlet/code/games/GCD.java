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
            qAndA[1][i] = getAnswer(qAndA[0][i]);
        }
        return qAndA;
    }

    static String getAnswer(String question) {
        String answer = new String;
        int a = Integer.parseInt(question.split(" ")[0]);
        int b = Integer.parseInt(question.split(" ")[1]);
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for (int j = Math.min(a, b); j > 0; j--) {
            if ((max % j == 0) && (min % j == 0)) {
                answer = Integer.toString(j);
                break;
            }
        }
        return answer;
    }
}
