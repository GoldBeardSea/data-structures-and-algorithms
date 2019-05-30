package Challenges;

public class BinarySearch {
    public static int binarySearch(int[] sortedArray, int key) {
        if (sortedArray.length == 0) {
            System.out.println("The Array is Empty");
            return -1;
        }
        int start = 0;
        int end = sortedArray.length - 1;
        while (start <= end) {
            int middle = ((start + end) / 2);
            if (sortedArray[middle] > key) {
                end = middle;
                end--;
            } else if (sortedArray[middle] < key) {
                start = middle;
                start++;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
