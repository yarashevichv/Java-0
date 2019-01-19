package by.epam.javatraining.veranikayarashevich.tasks.maintask01.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask01.userexceptions.EmptyArrayException;

/**
 * Class calculate geometric and arithmetic average of numbers array.
 *
 * @author Veranika Yarashevich
 * @version 1.0 22 Dec 2018
 */
public class AverageOfNumbers {

    public static double calculateArithmeticAverage(int[] numbers) throws EmptyArrayException {
        double result = 0;
        int[] array = numbers;

        if (array.length == 0) {
            throw new EmptyArrayException();
        } else {
            for (int i = 0; i < array.length; i++) {
                result += array[i];
            }

            return result / array.length;
        }
    }

    public static double calculateGeometricAverage(int[] numbers) throws EmptyArrayException {
        int[] array = numbers;
        double result;

        if (array.length == 0) {
            throw new EmptyArrayException();
        } else {
            result = array[0];

            for (int i = 1; i < array.length; i++) {
                result *= array[i];
            }

            if (result > 0) {
                return Math.pow(result, 1. / array.length);
            } else {
                return -1;
            }
        }
    }
}
