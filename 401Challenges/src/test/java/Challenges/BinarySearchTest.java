package Challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testBinarySearch_keyInArrayHigh() {
        int[] array = {2, 4, 6, 8, 10, 12};
        int key = 10;
        int expected = 4;
        int actual = BinarySearch.binarySearch(array, key);
        assertEquals(expected, actual);
    }

    @Test
    public void testBinarySearch_keyInArrayLow() {
        int[] array = {2, 4, 6, 8, 10, 12};
        int key = 2;
        int expected = 0;
        int actual = BinarySearch.binarySearch(array, key);
        assertEquals(expected, actual);
    }

    @Test
    public void testBinarySearch_keyNotInArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 19, 90, 1000, 100000, 200000, 3000000};
        int key = 95;
        int expected = -1;
        int actual = BinarySearch.binarySearch(array, key);
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testBinarySearch_nullArray() {
        int[] testArray = null;
        int num = 17;
        BinarySearch.binarySearch(testArray, num);
    }



    @Test(expected = NullPointerException.class)
    public void testBinarySearch_nullKey() {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 19, 90, 1000, 100000, 200000, 3000000};
        Integer key = null;
        BinarySearch.binarySearch(array, key);
    }
}