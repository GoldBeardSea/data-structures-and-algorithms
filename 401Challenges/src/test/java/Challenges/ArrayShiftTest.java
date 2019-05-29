package Challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testShiftArray_odd() {
        int[] testArray = {4, 8, 15, 23, 42};
        int num = 16;
        int[] expectedArray = {4, 8, 15, 16, 23, 42};
        int[] actual = ArrayShift.insertShiftArray(testArray, num);
        assertArrayEquals(expectedArray, actual);
    }

    @Test
    public void testShiftArray_even() {
        int[] testArray = {4, 8, 15, 23, 42, 12};
        int num = 17;
        int[] expectedArray = {4, 8, 15, 17, 23, 42, 12};
        int[] actual = ArrayShift.insertShiftArray(testArray, num);
        assertArrayEquals(expectedArray, actual);
    }

    @Test
    public void testShiftArray_negative() {
            int[] testArray = {-1, -5, -6, -1, -2, -5};
            int num = 17;
            int[] expectedArray = {-1, -5, -6, 17, -1, -2, -5};
            int[] actual = ArrayShift.insertShiftArray(testArray, num);
            assertArrayEquals(expectedArray, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testShiftArray_nullArray() {
        int[] testArray = null;
        int num = 17;
        ArrayShift.insertShiftArray(testArray, num);

    }
}