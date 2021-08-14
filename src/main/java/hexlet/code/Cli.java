package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;

    public static void greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        userName = name;
    }

    public static String getName() {
        return userName;
    }
}
