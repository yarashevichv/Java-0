package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model;

/**
 * Class reverses elements of array.
 *
 * @version 1.0 22 Dec 2018
 * @author Veranika Yarashevich
 */
public class ArrayReversal {

    public static final int REVERSE_UNIT = -1;

    public static int[] reverseArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= REVERSE_UNIT;
        }

        return numbers;
    }
}
