package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ATTEMPTS = 3;

    private static String userName;

    public static void start(String rules, String[] qAndA) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        startGame(qAndA);
    }

    static void startGame(String[] qAndA) {
        boolean isWinner = true;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ATTEMPTS; i++) {
            System.out.println("Question: " + qAndA[i]);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (answer.equals(qAndA[ATTEMPTS + i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + qAndA[ATTEMPTS + i] + "'.");
                isWinner = false;
                break;
            }
        }
        if (isWinner) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
