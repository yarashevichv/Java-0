package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Class tests methods of SortingArray class.
 *
 * @author Veranika Yarachevich
 * @version 1.0 22 Dec 2018
 */
public class SortingArrayTest {

    public static final Random RANDOM = new Random();

    @Test
    public void bubbleSort1() {
        int[] array = {1, 0, 5, 4, 6};
        assertArrayEquals(new int[]{0, 1, 4, 5, 6}, SortingArray.bubbleSort(array));
    }

    @Test
    public void bubbleSort2() {
        int[] array = {5, 35, -8, 2, 63, 99};
        assertArrayEquals(new int[]{-8, 2, 5, 35, 63, 99}, SortingArray.bubbleSort(array));
    }

    @Test
    public void bubbleSort3() {
        int[] array = {-2, 0, 5};
        assertArrayEquals(new int[]{-2, 0, 5}, SortingArray.bubbleSort(array));
    }

    @Test
    public void insertionSort1() {
        int[] array = {1, 0, 5, 4, 6};
        assertArrayEquals(new int[]{0, 1, 4, 5, 6}, SortingArray.insertionSort(array));
    }

    @Test
    public void insertionSort2() {
        int[] array = {-5, -89, -10, -8};
        assertArrayEquals(new int[]{-89, -10, -8, -5}, SortingArray.insertionSort(array));
    }

    @Test
    public void insertionSort3() {
        int[] array = {10, 0, 5};
        assertArrayEquals(new int[]{0, 5, 10}, SortingArray.insertionSort(array));
    }

    @Test
    public void selectionSort1() {
        int array[] = {19, 13, 10, 6, 21};
        assertArrayEquals(new int[]{6, 10, 13, 19, 21}, SortingArray.selectionSort(array));
    }

    @Test
    public void selectionSort2() {
        int array[] = {1, 0, 2};
        assertArrayEquals(new int[]{0, 1, 2}, SortingArray.selectionSort(array));
    }

    @Test
    public void selectionSort3() {
        int array[] = {-1, 2, 7};
        assertArrayEquals(new int[]{-1, 2, 7}, SortingArray.selectionSort(array));
    }

    @Test
    public void mergeSort1() {
        int array[] = {0, 5, 7, -9, -8, 4};
        assertArrayEquals(new int[]{-9, -8, 0, 4, 5, 7},
                SortingArray.mergeSort(array, 0, array.length - 1));
    }

    @Test
    public void mergeSort2() {
        int array[] = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt();
        }

        assertArrayEquals(SortingArray.bubbleSort(array),
                SortingArray.mergeSort(array, 0, array.length - 1));
    }

    @Test
    public void mergeSort3() {
        int[] array = {5, 4, 3, 2, 1, 0, -1, -2};
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2, 3, 4, 5},
                SortingArray.mergeSort(array, 0, array.length - 1));
    }
}