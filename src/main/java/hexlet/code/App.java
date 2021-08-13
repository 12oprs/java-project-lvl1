package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int exit = 0;
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = sc.nextInt();
        System.out.println("");
        switch (choice) {
            case exit:
                break;
            case greet:
                Cli.greeting();
                break;
            case even:
                Even.start();
                break;
            case calc:
                Calc.start();
                break;
            case gcd:
                GCD.start();
                break;
            default:
                break;
        }


    }


}
