package by.epam.javatraining.veranikayarashevich.tasks.maintask01.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask01.userexceptions.EmptyArrayException;

/**
 * Class finds extreme numbers (min and max) of numbers array.
 *
 * @author Veranika Yarashevich
 * @version 1.0 22 Dec 2018
 */
public class ExtremeNumber {

    public static int findMax(int[] numbers) throws EmptyArrayException {
        int[] array = numbers;
        int result;

        if (array.length == 0) {
            throw new EmptyArrayException();
        } else {
            result = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > result) {
                    result = array[i];
                }
            }

            return result;
        }
    }

    public static int findMin(int[] numbers) throws EmptyArrayException {
        int[] array = numbers;
        int result;

        if (array.length == 0) {
            throw new EmptyArrayException();
        } else {
            result = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] < result) {
                    result = array[i];
                }
            }

            return result;
        }
    }
}
