package by.epam.javatraining.veranikayarashevich.tasks.maintask01.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask01.userexceptions.EmptyArrayException;

/**
 * Class searches position of input element in numbers array.
 *
 * @author Veranika Yarachevich
 * @version 1.0 22 Dec 2018
 */
public class SearchElement {

    public static int linearSearchElement(int[] numbers, int element) {
        int result = -1;
        int[] array = numbers;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static int binarySearchElement(int[] numbers, int element, int firstIndex, int lastIndex)
            throws EmptyArrayException {

        int result = -1;
        int[] array = numbers;

        if (array.length == 0) {
            throw new EmptyArrayException();
        } else {
            int[] sortedArray = SortingArray.bubbleSort(array);

            while (firstIndex <= lastIndex) {
                int middleIndex = (firstIndex + lastIndex) / 2;

                if (sortedArray[middleIndex] < element) {
                    firstIndex = middleIndex + 1;
                } else if (sortedArray[middleIndex] > element) {
                    lastIndex = middleIndex - 1;
                } else if (sortedArray[middleIndex] == element) {
                    result = middleIndex;
                    break;
                }
            }

            return result;
        }
    }
}

