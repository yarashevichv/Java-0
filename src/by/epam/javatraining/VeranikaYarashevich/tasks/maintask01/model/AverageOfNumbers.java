package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model;

/**
 * Class calculate geometric and arithmetic average of numbers array.
 *
 * @version 1.0 22 Dec 2018
 * @author Veranika Yarashevich
 */
public class AverageOfNumbers {

    public static double calculateArithmeticAverage(int[] numbers) {
        double result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        return result / numbers.length;
    }

    public static double calculateGeometricAverage(int[] numbers) {
        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result *= numbers[i];
        }

        if (result > 0) {
            return Math.pow(result, 1. / numbers.length);
        } else {
            return -1;
        }
    }
}
