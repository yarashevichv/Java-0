package by.epam.javatraining.veranikayarashevich.tasks.maintask01.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask01.userexceptions.EmptyArrayException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class tests methods of ArrayReversal class.
 *
 * @author Veranika Yarashevich
 * @version 1.0 22 Dec 2018
 */
public class ArrayReversalTest {

    @Test
    public void reverseArray1() {
        int array[] = {-1, 5, 0, -10};

        try {
            assertArrayEquals(new int[]{-10, 0, 5, -1}, ArrayReversal.reverseArray(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void reverseArray2() {
        int array[] = {-15};

        try {
            assertArrayEquals(new int[]{-15}, ArrayReversal.reverseArray(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void reverseArray3() {
        int array[] = {55, 5, 0, -150, -195};

        try {
            assertArrayEquals(new int[]{-195, -150, 0, 5, 55}, ArrayReversal.reverseArray(array));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }
}