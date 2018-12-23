package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Class tests methods of SearchElement class.
 *
 * @author Veranika Yarachevich
 * @version 1.0 22 Dec 2018
 */
public class SearchElementTest {

    public static final Random RANDOM = new Random();

    @Test
    public void linearSearchElement1() {
        int[] array = {1, 5, 8, 0, -4};
        assertEquals(2, SearchElement.linearSearchElement(array, 8));
    }

    @Test
    public void linearSearchElement2() {
        int[] array = {1, 5, 8, 0, -4};
        assertEquals(4, SearchElement.linearSearchElement(array, -4));
    }

    @Test
    public void linearSearchElement3() {
        int[] array = {1, 5, 8, 0, -4};
        assertEquals(-1, SearchElement.linearSearchElement(array, 500));
    }

    @Test
    public void binarySearchElement1() {
        int array[] = {-1, 25, 10, 4};
        int sortedArray[] = SortingArray.bubbleSort(array);
        assertEquals(2,
                SearchElement.binarySearchElement(sortedArray, 10, 0, array.length - 1));
    }

    @Test
    public void binarySearchElement2() {
        int array[] = {-1, 5, 10, 8, -7, 0, 54, 7};
        int sortedArray[] = SortingArray.bubbleSort(array);
        assertEquals(7,
                SearchElement.binarySearchElement(sortedArray, 54, 0, array.length - 1));
    }

    @Test
    public void binarySearchElement3() {
        int array[] = {-10, 5, -165};
        int sortedArray[] = SortingArray.bubbleSort(array);
        assertEquals(1,
                SearchElement.binarySearchElement(sortedArray, -10, 0, array.length - 1));
    }
}