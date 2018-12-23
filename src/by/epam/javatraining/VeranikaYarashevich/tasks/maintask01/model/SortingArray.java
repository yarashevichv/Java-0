package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model;

/**
 * Class sorts array of numbers by ascending.
 *
 * @version 1.0 22 Dec 2018
 * @author Veranika Yarashevich
 */
public class SortingArray {

    public static int[] bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        return numbers;
    }

    public static int[] insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > temp) {
                numbers[j + 1] = numbers[j];
                j -= 1;
            }

            numbers[j + 1] = temp;
        }

        return numbers;
    }

    public static int[] selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            int minIndex = i;

            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    minIndex = j;
                }
            }

            if (min < numbers[i]) {
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
        }

        return numbers;
    }

    public static int[] mergeSort(int[] numbers, int startIndex, int endIndex) {
        if (startIndex != endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;

            mergeSort(numbers, startIndex, middleIndex);
            mergeSort(numbers, middleIndex + 1, endIndex);
            merge(numbers, startIndex, middleIndex, endIndex);
        }

        return numbers;
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
