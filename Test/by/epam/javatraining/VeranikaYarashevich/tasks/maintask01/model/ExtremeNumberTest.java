package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class tests methods of ExtremeNumber class.
 *
 * @version 1.0 22 Dec 2018
 * @author Veranika Yarashevich
 */
public class ExtremeNumberTest {

    @Test
    public void findMax1() {
        int[] array = {14, -5, 0, 7, 45};
        Assert.assertEquals(45, ExtremeNumber.findMax(array));
    }

    @Test
    public void findMax2() {
        int[] array = {-100, -5, -29, -7, -18};
        assertEquals(-5, ExtremeNumber.findMax(array));
    }

    @Test
    public void findMax3() {
        int[] array = {-100};
        assertEquals(-100, ExtremeNumber.findMax(array));
    }

    @Test
    public void findMin1() {
        int [] array = {100, 56, 468, 123, 0};
        assertEquals(0, ExtremeNumber.findMin(array));
    }

    @Test
    public void findMin2() {
        int [] array = {-1, -504, -36, -89, -3};
        assertEquals(-504, ExtremeNumber.findMin(array));
    }

    @Test
    public void findMin3() {
        int [] array = {10, 562, 10, 121, 13};
        assertEquals(10, ExtremeNumber.findMin(array));
    }
}