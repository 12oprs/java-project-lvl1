package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final int ATTEMPTS = 3;
    private static boolean gameResult = true;

    public static int getAttempts() {
        return ATTEMPTS;
    }

    public static void start(String rules, String[] questions, String[] answers) {
        Cli.greeting();
        System.out.println(rules);
        game(questions, answers);
        result();
    }

    static void game(String[] question, String[] answers) {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < ATTEMPTS; i++) {
            System.out.println("Question: " + question[i]);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            i = check(i, answer, answers[i]);
        }
    }

     static int check(int round, String ans, String trueAns) {
        if (ans.equals(trueAns)) {
            System.out.println("Correct!");
            return round;
        } else {
            System.out.println("'" + ans + "' is wrong answer ;(. Correct answer was '" + trueAns + "'.");
            gameResult = false;
            return ATTEMPTS;
        }

    }
    static void result() {
        if (gameResult) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        } else {
            System.out.println("Let's try again, " + Cli.getName() + "!");
        }
    }


}
