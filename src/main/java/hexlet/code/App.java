package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String choice = sc.nextLine();
        System.out.println("");
        switch (choice) {
            case "0" -> System.out.println("Goodbye!");
            case "1" -> Cli.greeting();
            case "2" -> Even.start();
            case "3" -> Calc.start();
            case "4" -> GCD.start();
            case "5" -> Progression.start();
            case "6" -> Prime.start();
            default -> System.out.println("");
        }
    }
}

