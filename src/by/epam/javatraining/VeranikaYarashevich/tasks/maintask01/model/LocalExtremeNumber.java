package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model;

/**
 * Class finds local max in numbers array.
 *
 * @version 1.0 22 Dec 2018
 * @author Veranika Yarashevich
 */
public class LocalExtremeNumber {

    public static int findLocalMax(int[] numbers) {
        int result = -1;

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] < numbers [i - 1] && numbers[i - 1] > numbers[i - 2]) {
                result = i - 1;
                break;
            }
        }

        return result;
    }

    public static int findLocalMin(int[] numbers) {
        int result = -1;

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > numbers [i - 1] && numbers[i - 1] < numbers[i - 2]) {
                result = i - 1;
                break;
            }
        }

        return result;
    }
}
