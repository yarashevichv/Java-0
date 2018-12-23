package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.controller;

import by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model.*;
import by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.view.Printer;

import java.util.Arrays;
import java.util.Random;

/**
 * The class is controller of logic main methods of main task #1.
 *
 * @version 1.0 22 Dec 2018
 * @version Veranika Yarashevich
 */
public class MainTask01 {

    public static final int ARRAY_SIZE = 15;
    public static final int BOUND_OF_RANDOM = 25;

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] numbers = new int[ARRAY_SIZE];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = RANDOM.nextInt(BOUND_OF_RANDOM);
        }

        Printer.print("The array of numbers: " + Arrays.toString(numbers));

        Printer.print("\n\nThe max value of numbers array is " + ExtremeNumber.findMax(numbers));
        Printer.print("\nThe min value of numbers array is " + ExtremeNumber.findMin(numbers));

        Printer.print("\n\nThe arithmetic average is " + AverageOfNumbers.calculateArithmeticAverage(numbers));
        Printer.print("\nThe geometric average is " + AverageOfNumbers.calculateGeometricAverage(numbers));

        Printer.print("\n\nThe array is sorted ascending: " + CheckSortArray.isSortAsc(numbers));
        Printer.print("\nThe array is sorted descending: " + CheckSortArray.isSortDesc(numbers));

        Printer.print("\n\nThe position of first local max value is " + LocalExtremeNumber.findLocalMax(numbers));
        Printer.print("\nThe position of first local min value is " + LocalExtremeNumber.findLocalMin(numbers));

        Printer.print("\n\nThe position of number \'15\' is " + SearchElement.linearSearchElement(numbers, 15)
                + " by linear search");

        Printer.print("\n\nThe reversed array is " + Arrays.toString(ArrayReversal.reverseArray(numbers)));

        ArrayReversal.reverseArray(numbers);

        Printer.print("\n\nThe sorted array is " + Arrays.toString(SortingArray.bubbleSort(numbers))
                + " by bubble sort");
        Printer.print("\nThe sorted array is " + Arrays.toString(SortingArray.insertionSort(numbers))
                + " by insertion sort");
        Printer.print("\nThe sorted array is " + Arrays.toString(SortingArray.selectionSort(numbers))
                + " by selection sort");
        Printer.print("\nThe sorted array is "
                + Arrays.toString(SortingArray.mergeSort(numbers, 0, numbers.length - 1))
                + " by merge sort");

        Printer.print("\n\nThe position of number \'8\' is "
                + SearchElement.binarySearchElement(numbers, 8, 0, numbers.length - 1)
                + " by binary search");
    }
}
