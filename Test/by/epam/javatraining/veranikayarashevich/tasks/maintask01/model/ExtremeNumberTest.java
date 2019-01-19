package by.epam.javatraining.veranikayarashevich.tasks.maintask01.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask01.userexceptions.EmptyArrayException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class tests methods of ExtremeNumber class.
 *
 * @author Veranika Yarashevich
 * @version 1.0 22 Dec 2018
 */
public class ExtremeNumberTest {

    @Test
    public void findMax1() {
        int[] array = {14, -5, 0, 7, 45};

        try {
            Assert.assertEquals(45, ExtremeNumber.findMax(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findMax2() {
        int[] array = {-100, -5, -29, -7, -18};

        try {
            assertEquals(-5, ExtremeNumber.findMax(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findMax3() {
        int[] array = {-100};

        try {
            assertEquals(-100, ExtremeNumber.findMax(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findMin1() {
        int[] array = {100, 56, 468, 123, 0};

        try {
            assertEquals(0, ExtremeNumber.findMin(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findMin2() {
        int[] array = {-1, -504, -36, -89, -3};

        try {
            assertEquals(-504, ExtremeNumber.findMin(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findMin3() {
        int[] array = {10, 562, 10, 121, 13};

        try {
            assertEquals(10, ExtremeNumber.findMin(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }
}