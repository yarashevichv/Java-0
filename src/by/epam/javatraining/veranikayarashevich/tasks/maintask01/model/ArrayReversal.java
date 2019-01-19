package by.epam.javatraining.veranikayarashevich.tasks.maintask01.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask01.userexceptions.EmptyArrayException;

/**
 * Class reverses elements of array.
 *
 * @author Veranika Yarashevich
 * @version 1.0 22 Dec 2018
 */
public class ArrayReversal {

    public static int[] reverseArray(int[] numbers) throws EmptyArrayException {
        int[] array = numbers;
        int temp;
        int sizeOfArray = array.length;

        if (sizeOfArray == 0) {
            throw new EmptyArrayException();
        } else {
            for (int i = 0; i < array.length / 2; i++, sizeOfArray--) {
                temp = array[i];
                array[i] = array[sizeOfArray - 1];
                array[sizeOfArray - 1] = temp;
            }

            return array;
        }
    }
}
