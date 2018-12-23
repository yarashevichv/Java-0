package by.epam.javatraining.VeranikaYarashevich.tasks.maintask01.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class tests methods of AverageOfNumbers class.
 *
 * @version 1.0 22 Dec 2018
 * @author Veranika Yarashevich
 */
public class AverageOfNumbersTest {

    @Test
    public void calculateArithmeticAverage1() {
        int[] array = {2, 2, 3, 4, 5};
        assertEquals(3.2, AverageOfNumbers.calculateArithmeticAverage(array), 0.001);
    }

    @Test
    public void calculateArithmeticAverage2() {
        int[] array = {10, 0};
        assertEquals(5, AverageOfNumbers.calculateArithmeticAverage(array), 0.001);
    }

    @Test
    public void calculateArithmeticAverage3() {
        int[] array = {-18, 10, -8, 6};
        assertEquals(-2.5, AverageOfNumbers.calculateArithmeticAverage(array), 0.001);
    }

    @Test
    public void calculateGeometricAverage1() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2.605, AverageOfNumbers.calculateGeometricAverage(array), 0.001);
    }

    @Test
    public void calculateGeometricAverage2() {
        int[] array = {-1, -3, 4, -5};
        assertEquals(-1, AverageOfNumbers.calculateGeometricAverage(array), 0.001);
    }

    @Test
    public void calculateGeometricAverage3() {
        int[] array = {10, 21, 65};
        assertEquals(23.898, AverageOfNumbers.calculateGeometricAverage(array), 0.001);
    }
}