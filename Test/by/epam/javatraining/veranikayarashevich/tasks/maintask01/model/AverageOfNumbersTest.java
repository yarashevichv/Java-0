package by.epam.javatraining.veranikayarashevich.tasks.maintask01.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask01.userexceptions.EmptyArrayException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class tests methods of AverageOfNumbers class.
 *
 * @author Veranika Yarashevich
 * @version 1.0 22 Dec 2018
 */
public class AverageOfNumbersTest {

    @Test
    public void calculateArithmeticAverage1() {
        int[] array = {2, 2, 3, 4, 5};

        try {
            assertEquals(3.2, AverageOfNumbers.calculateArithmeticAverage(array), 0.001);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void calculateArithmeticAverage2() {
        int[] array = {10, 0};

        try {
            assertEquals(5, AverageOfNumbers.calculateArithmeticAverage(array), 0.001);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void calculateArithmeticAverage3() {
        int[] array = {-18, 10, -8, 6};

        try {
            assertEquals(-2.5, AverageOfNumbers.calculateArithmeticAverage(array), 0.001);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void calculateGeometricAverage1() {
        int[] array = {1, 2, 3, 4, 5};

        try {
            assertEquals(2.605, AverageOfNumbers.calculateGeometricAverage(array), 0.001);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void calculateGeometricAverage2() {
        int[] array = {-1, -3, 4, -5};

        try {
            assertEquals(-1, AverageOfNumbers.calculateGeometricAverage(array), 0.001);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void calculateGeometricAverage3() {
        int[] array = {10, 21, 65};

        try {
            assertEquals(23.898, AverageOfNumbers.calculateGeometricAverage(array), 0.001);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }
}