package by.epam.javatraining.veranikayarashevich.tasks.maintask01.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask01.userexceptions.EmptyArrayException;

/**
 * Class checks sorting of numbers array.
 *
 * @author Veranika Yarashevich
 * @version 1.0 22 Dec 2018
 */
public class CheckSortArray {

    public static boolean isSortAsc(int[] numbers) throws EmptyArrayException {
        boolean result = false;
        int[] array = numbers;

        if (array.length == 0) {
            throw new EmptyArrayException();
        } else {
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }

            return result;
        }
    }

    public static boolean isSortDesc(int[] numbers) throws EmptyArrayException {
        boolean result = false;
        int[] array = numbers;

        if (array.length == 0) {
            throw new EmptyArrayException();
        } else {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }

            return result;
        }
    }
}
