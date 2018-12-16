package PracticalTask02;

public class AverageOfNumbers {

    private static final int DOZEN = 10;
    private static final int SIZE = 6;

    public static double findArithmeticAverage(int number) {

        int[] numbers = new int[SIZE];
        double result = 0;

        for (int i = SIZE - 1; i >= 0; i--) {
            numbers[i] = number % DOZEN;
            number /= DOZEN;
        }

        for (int i = 1; i < SIZE; i++) {
            result += numbers[i];
        }

        return result / SIZE;
    }

    public static double findGeometricAverage(int number) {

        int[] numbers = new int[SIZE];
        double result;

        for (int i = SIZE - 1; i >= 0; i--) {
            numbers[i] = number % DOZEN;
            number /= DOZEN;
        }

        result = numbers[0];

        for (int i = 1; i < SIZE; i++) {
            result *= numbers[i];
        }

        return Math.pow(result, 1.0/SIZE);
    }
}
