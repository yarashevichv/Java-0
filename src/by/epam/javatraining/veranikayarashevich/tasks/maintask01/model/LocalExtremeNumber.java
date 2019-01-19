package by.epam.javatraining.veranikayarashevich.tasks.maintask01.model;

/**
 * Class finds local max in numbers array.
 *
 * @author Veranika Yarashevich
 * @version 1.0 22 Dec 2018
 */
public class LocalExtremeNumber {

    public static int findLocalMax(int[] numbers) {
        int result = -1;
        int[] array = numbers;

        for (int i = 2; i < array.length; i++) {
            if (array[i] < array[i - 1] && array[i - 1] > array[i - 2]) {
                result = i - 1;
                break;
            }
        }

        return result;
    }

    public static int findLocalMin(int[] numbers) {
        int result = -1;
        int[] array = numbers;

        for (int i = 2; i < array.length; i++) {
            if (array[i] > array[i - 1] && array[i - 1] < array[i - 2]) {
                result = i - 1;
                break;
            }
        }

        return result;
    }
}
