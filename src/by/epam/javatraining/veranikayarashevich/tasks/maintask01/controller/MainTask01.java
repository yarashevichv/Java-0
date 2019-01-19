package by.epam.javatraining.veranikayarashevich.tasks.maintask01.controller;

import by.epam.javatraining.veranikayarashevich.tasks.maintask01.model.*;
import by.epam.javatraining.veranikayarashevich.tasks.maintask01.userexceptions.EmptyArrayException;
import by.epam.javatraining.veranikayarashevich.tasks.maintask01.view.Printer;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Random;

/**
 * The class is controller of logic main methods of main task #1.
 *
 * @author Veranika Yarashevich
 * @version 1.0 22 Dec 2018
 */
public class MainTask01 {

    public static final int ARRAY_SIZE = 15;
    public static final int BOUND_OF_RANDOM = 25;

    public static final Random RANDOM = new Random();

    private static Logger LOG = Logger.getRootLogger();

    public static void main(String[] args) {
        int[] numbers = new int[ARRAY_SIZE];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = RANDOM.nextInt(BOUND_OF_RANDOM);
        }

        try {
            LOG.info("The array of numbers: " + Arrays.toString(numbers));

            LOG.info("\n\nThe max value of numbers array is " + ExtremeNumber.findMax(numbers));
            LOG.info("\nThe min value of numbers array is " + ExtremeNumber.findMin(numbers));

            LOG.info("\n\nThe arithmetic average is " + AverageOfNumbers.calculateArithmeticAverage(numbers));
            LOG.info("\nThe geometric average is " + AverageOfNumbers.calculateGeometricAverage(numbers));

            LOG.info("\n\nThe array is sorted ascending: " + CheckSortArray.isSortAsc(numbers));
            LOG.info("\nThe array is sorted descending: " + CheckSortArray.isSortDesc(numbers));

            LOG.info("\n\nThe position of first local max value is " + LocalExtremeNumber.findLocalMax(numbers));
            LOG.info("\nThe position of first local min value is " + LocalExtremeNumber.findLocalMin(numbers));

            LOG.info("\n\nThe position of number \'15\' is " + SearchElement.linearSearchElement(numbers, 15)
                    + " by linear search");

            LOG.info("\n\nThe reversed array is " + Arrays.toString(ArrayReversal.reverseArray(numbers)));

            ArrayReversal.reverseArray(numbers);

            LOG.info("\n\nThe sorted array is " + Arrays.toString(SortingArray.bubbleSort(numbers))
                    + " by bubble sort");
            LOG.info("\nThe sorted array is " + Arrays.toString(SortingArray.insertionSort(numbers))
                    + " by insertion sort");
            LOG.info("\nThe sorted array is " + Arrays.toString(SortingArray.selectionSort(numbers))
                    + " by selection sort");
            LOG.info("\nThe sorted array is "
                    + Arrays.toString(SortingArray.mergeSort(numbers, 0, numbers.length - 1))
                    + " by merge sort");

            LOG.info("\n\nThe position of number \'8\' is "
                    + SearchElement.binarySearchElement(numbers, 8, 0, numbers.length - 1)
                    + " by binary search");
        } catch (EmptyArrayException e) {
            LOG.error(e.getMessage() + "\n");
        }
    }
}
