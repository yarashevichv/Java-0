package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class tests methods of CheckSortArray class.
 *
 * @version 1.0 22 Dec 2018
 * @author Veranika Yarashevich
 */
public class CheckSortArrayTest {

    @Test
    public void isSortAsc1() {
        int[] array = {1, 2, 3};
        Assert.assertEquals(true, CheckSortArray.isSortAsc(array));
    }

    @Test
    public void isSortAsc2() {
        int[] array = {10, 2, 3};
        assertEquals(false, CheckSortArray.isSortAsc(array));
    }

    @Test
    public void isSortAsc3() {
        int[] array = {1, 2, 3, 2, 5, 10};
        assertEquals(false, CheckSortArray.isSortAsc(array));
    }

    @Test
    public void isSortDesc1() {
        int[] array = {3, 2, 1};
        assertEquals(true, CheckSortArray.isSortDesc(array));
    }

    @Test
    public void isSortDesc2() {
        int[] array = {10, 2, 3};
        assertEquals(false, CheckSortArray.isSortDesc(array));
    }

    @Test
    public void isSortDesc3() {
        int[] array = {10, 9, 9, 8};
        assertEquals(false, CheckSortArray.isSortDesc(array));
    }
}