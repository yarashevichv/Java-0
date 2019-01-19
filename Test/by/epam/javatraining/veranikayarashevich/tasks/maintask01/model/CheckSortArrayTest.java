package by.epam.javatraining.veranikayarashevich.tasks.maintask01.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask01.userexceptions.EmptyArrayException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class tests methods of CheckSortArray class.
 *
 * @author Veranika Yarashevich
 * @version 1.0 22 Dec 2018
 */
public class CheckSortArrayTest {

    @Test
    public void isSortAsc1() {
        int[] array = {1, 2, 3};

        try {
            Assert.assertEquals(true, CheckSortArray.isSortAsc(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void isSortAsc2() {
        int[] array = {10, 2, 3};

        try {
            assertEquals(false, CheckSortArray.isSortAsc(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void isSortAsc3() {
        int[] array = {1, 2, 3, 2, 5, 10};

        try {
            assertEquals(false, CheckSortArray.isSortAsc(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void isSortDesc1() {
        int[] array = {3, 2, 1};

        try {
            assertEquals(true, CheckSortArray.isSortDesc(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void isSortDesc2() {
        int[] array = {10, 2, 3};

        try {
            assertEquals(false, CheckSortArray.isSortDesc(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void isSortDesc3() {
        int[] array = {10, 9, 9, 8};

        try {
            assertEquals(false, CheckSortArray.isSortDesc(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }
}