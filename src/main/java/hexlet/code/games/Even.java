package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static String rules = "Answer 'yes' if number even otherwise answer 'no'.";
    private static String[] answers = new String[Engine.getAttempts()];

    public static void start() {
            Engine.start(rules, getQuestions(), answers);
        }
        static String[] getQuestions() {
            String[] questions = new String[Engine.getAttempts()];
            Random rand = new Random();
            for (int i = 0; i < questions.length; i++) {
                int temp = rand.nextInt();
                questions[i] = Integer.toString(temp);
                calcAnswer(i, temp);
            }
            return questions;
        }

    static void calcAnswer(int index, int a) {
        answers[index] = a % 2 == 0 ? "yes" : "no";
    }
}
