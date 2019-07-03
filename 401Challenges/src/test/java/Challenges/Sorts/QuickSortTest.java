package Challenges.Sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSort() {
        int[] array = {19, 466, 464, 72, 23, 6, 2, 79, 25, 65, 76};
        int[] sortArray = QuickSort.quickSort(array, 0, array.length-1);
        for (int num: sortArray) {
            System.out.println(num);
        }
        assertEquals("two should be the start", 2, sortArray[0]);
        assertEquals("466 should be at the end", 466, sortArray[sortArray.length-1]);
    }

    @Test(expected = NullPointerException.class)
    public void quickSort_unhappy() {
        int[] array = null;
        QuickSort.quickSort(array, 0, array.length-1);
    }

    @Test
    public void quickSort_negativesToo() {
        int[] array = {19, -466, 464, 72, -23, 6, 2, -79, 25, 65, 76};
        int[] sortArray = QuickSort.quickSort(array, 0, array.length-1);
        assertEquals("-466 should be the start", -466, sortArray[0]);
        assertEquals("464 should be at the end", 464, sortArray[sortArray.length-1]);
    }
}