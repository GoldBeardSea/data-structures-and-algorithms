package Challenges.Sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void sort_test() {
        int[] testArrayBefore = {3, 5, 9, 4, 1};
        int[] testArrayAfter = Sort.insertSort(testArrayBefore);
        assertEquals("this should be equal to one", 1, testArrayAfter[0]);
        assertEquals("this should be equal to nine", 9, testArrayAfter[4]);

    }

    @Test
    public void sort_null() {
        int[] testArray = null;
        assertNull(Sort.insertSort(testArray));
        // should print empty arr
    }

    @Test
    public void sort_negative() {
        int[] testArrayBefore = {3, 5, 9, 4, 1, -1000, -50, -100, -1, 1000000, 4};
        int[] testArrayAfter = Sort.insertSort(testArrayBefore);
        assertEquals("This should be equal to -1000", -1000, testArrayAfter[0]);
    }

}