package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model;

/**
 * Class finds extreme numbers (min and max) of numbers array.
 *
 * @version 1.0 22 Dec 2018
 * @author Veranika Yarashevich
 */
public class ExtremeNumber {

    public static int findMax(int[] numbers) {
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }

        return result;
    }

    public static int findMin(int[] numbers) {
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < result) {
                result = numbers[i];
            }
        }

        return result;
    }
}
