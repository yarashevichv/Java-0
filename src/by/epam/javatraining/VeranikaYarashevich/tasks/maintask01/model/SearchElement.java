package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model;

/**
 * Class searches position of input element in numbers array.
 *
 * @author Veranika Yarachevich
 * @version 1.0 22 Dec 2018
 */
public class SearchElement {

    public static int linearSearchElement(int[] numbers, int element) {
        int result = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static int binarySearchElement(int[] numbers, int element, int firstIndex, int lastIndex) {
        int result = -1;
        int[] sortedArray = SortingArray.bubbleSort(numbers);

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

