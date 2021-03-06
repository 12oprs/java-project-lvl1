package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ATTEMPTS = 3;

    public static void start(String rules, String[][] qAndA) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        startGame(userName, qAndA);
    }

    static void startGame(String userName, String[][] qAndA) {
        boolean isWinner = true;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ATTEMPTS; i++) {
            System.out.println("Question: " + qAndA[0][i]);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (answer.equals(qAndA[1][i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + qAndA[1][i] + "'.");
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
