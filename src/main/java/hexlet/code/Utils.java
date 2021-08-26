package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int RANGE = 100;

    public static int getRandomValue() {
        Random rand = new Random();
        return rand.nextInt(RANGE);
    }

    public static int getRandomValue(int range) {
        Random rand = new Random();
        return rand.nextInt(range);
    }
}
