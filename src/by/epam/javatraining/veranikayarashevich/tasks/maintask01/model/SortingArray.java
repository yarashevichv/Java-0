package by.epam.javatraining.veranikayarashevich.tasks.maintask01.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask01.userexceptions.EmptyArrayException;

/**
 * Class sorts array of numbers by ascending.
 *
 * @author Veranika Yarashevich
 * @version 1.0 22 Dec 2018
 */
public class SortingArray {

    public static int[] bubbleSort(int[] numbers) throws EmptyArrayException {
        int[] array = numbers;

        if (array.length == 0) {
            throw new EmptyArrayException();
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 1; j < array.length - i; j++) {
                    if (array[j - 1] > array[j]) {
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }
            }

            return array;
        }
    }

    public static int[] insertionSort(int[] numbers) throws EmptyArrayException {
        int[] array = numbers;

        if (array.length == 0) {
            throw new EmptyArrayException();
        } else {
            for (int i = 1; i < array.length; i++) {
                int temp = array[i];
                int j = i - 1;

                while (j >= 0 && array[j] > temp) {
                    array[j + 1] = array[j];
                    j -= 1;
                }

                array[j + 1] = temp;
            }

            return array;
        }
    }

    public static int[] selectionSort(int[] numbers) throws EmptyArrayException {
        int[] array = numbers;

        if (array.length == 0) {
            throw new EmptyArrayException();
        } else {
            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int minIndex = i;

                for (int j = i; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        minIndex = j;
                    }
                }

                if (min < array[i]) {
                    int temp = array[i];
                    array[i] = array[minIndex];
                    array[minIndex] = temp;
                }
            }

            return array;
        }
    }

    public static int[] mergeSort(int[] numbers, int startIndex, int endIndex) throws EmptyArrayException {
        int[] array = numbers;

        if (array.length == 0){
            throw new EmptyArrayException();
        } else {
            if (startIndex != endIndex) {
                int middleIndex = (startIndex + endIndex) / 2;

                mergeSort(array, startIndex, middleIndex);
                mergeSort(array, middleIndex + 1, endIndex);
                merge(array, startIndex, middleIndex, endIndex);
            }

            return array;
        }
    }

    public static void merge(int[] numbers, int startIndex, int middleIndex, int endIndex) {

        int[] leftArray = new int[middleIndex - startIndex + 2];
        int[] rightArray = new int[endIndex - middleIndex + 1];

        for (int i = startIndex; i <= middleIndex; i++) {
            leftArray[i - startIndex] = numbers[i];
        }

        leftArray[middleIndex - startIndex + 1] = Integer.MAX_VALUE;

        for (int i = middleIndex + 1; i <= endIndex; i++) {
            rightArray[i - middleIndex - 1] = numbers[i];
        }

        rightArray[endIndex - middleIndex] = Integer.MAX_VALUE;

        for (int k = startIndex, i = 0, j = 0; k <= endIndex; k++) {
            if (leftArray[i] <= rightArray[j]) {
                numbers[k] = leftArray[i];
                i++;
            } else {
                numbers[k] = rightArray[j];
                j++;
            }
        }
    }
}
