package PracticalTask02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NumberFlip {

    private static final int DOZEN = 10;
    private static final int SIZE = 7;

    public static String flipNumber(int number) {

        int[] numbers = new int[SIZE];
        int[] result = new int[SIZE];

        for (int i = SIZE - 1; i >= 0; i--) {
            numbers[i] = number % DOZEN;
            number /= DOZEN;
        }

        for (int i = 0; i < SIZE; i++) {
            result[SIZE - 1 - i] = numbers[i];
        }

        return Arrays.toString(result);
    }
}
