package by.epam.javatraining.veranikayarashevich.tasks.maintask01.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class tests methods of LocalExtremeNumber class.
 *
 * @author Veranika Yarashevich
 * @version 1.0 22 Dec 2018
 */
public class LocalExtremeNumberTest {

    @Test
    public void findLocalMax1() {
        int[] array = {-5, 2, 1, 4, 7};
        assertEquals(1, LocalExtremeNumber.findLocalMax(array));
    }

    @Test
    public void findLocalMax2() {
        int[] array = {9, 7};
        assertEquals(-1, LocalExtremeNumber.findLocalMax(array));
    }

    @Test
    public void findLocalMax3() {
        int[] array = {-5, -2, -10};
        assertEquals(1, LocalExtremeNumber.findLocalMax(array));
    }

    @Test
    public void findLocalMin1() {
        int[] array = {-5, -20, -10};
        assertEquals(1, LocalExtremeNumber.findLocalMin(array));
    }

    @Test
    public void findLocalMin2() {
        int[] array = {-5, -2};
        assertEquals(-1, LocalExtremeNumber.findLocalMin(array));
    }

    @Test
    public void findLocalMin3() {
        int[] array = {5, 25, 15, 20};
        assertEquals(2, LocalExtremeNumber.findLocalMin(array));
    }
}