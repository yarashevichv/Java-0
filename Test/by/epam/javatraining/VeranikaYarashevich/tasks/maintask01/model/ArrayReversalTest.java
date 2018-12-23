package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class tests methods of ArrayReversal class.
 *
 * @version 1.0 22 Dec 2018
 * @author Veranika Yarashevich
 */
public class ArrayReversalTest {

    @Test
    public void reverseArray1() {
        int array[] = {-1, 5, 0, -10};
        assertArrayEquals(new int[]{1, -5, 0, 10}, ArrayReversal.reverseArray(array));
    }

    @Test
    public void reverseArray2() {
        int array[] = {-15};
        assertArrayEquals(new int[]{15}, ArrayReversal.reverseArray(array));
    }

    @Test
    public void reverseArray3() {
        int array[] = {55, 5, 0, -150, -195};
        assertArrayEquals(new int[]{-55, -5, 0, 150, 195}, ArrayReversal.reverseArray(array));
    }
}