package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model;

/**
 * Class checks sorting of numbers array.
 *
 * @version 1.0 22 Dec 2018
 * @author Veranika Yarashevich
 */
public class CheckSortArray {

    public static boolean isSortAsc(int[] numbers) {
        boolean result = false;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        return result;
    }

    public static boolean isSortDesc(int[] numbers) {
        boolean result = false;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        return result;
    }
}
