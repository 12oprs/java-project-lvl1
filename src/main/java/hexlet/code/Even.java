package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    static final int ATTEMPTS = 3;

    public static void start() {


        Cli.greeting();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < ATTEMPTS; i++) {
            int question = rand.nextInt();
            String trueAnswer = question % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = sc.next();
            if (!answer.equals(trueAnswer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            } else {
                System.out.println("Correct!");
            }
        }

        if (i == ATTEMPTS) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }

    }


}
