package PracticalTask02;

public class CheckIncreaseOfNumbers {

    private static final int DOZEN = 10;
    private static final int SIZE = 4;

    public static boolean checkIncrease(int number) {

        int[] numbers = new int[SIZE];
        boolean result = false;

        for (int i = SIZE - 1; i >= 0; i--) {
            numbers[i] = number % DOZEN;
            number /= DOZEN;
        }

        for (int i = 1; i < SIZE; i++) {
            if (numbers[i] > numbers[i - 1]) {
                result = true;
            }
            else {
                result = false;
                break;
            }
        }

        return result;
    }
}
