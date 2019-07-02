package Challenges.Sorts;

public class MergeSort {

    public int[] mergeSort(int[] inputArr) {
        if arr.length > 1
        DECLARE mid <-- n/2
        DECLARE b <-- arr[0...mid]
        DECLARE c <-- arr[mid...n]
        // break down the left side
        Mergesort(b)
        // break down the right side
        Mergesort(c)
        // merge the left and the right side together
        Merge(b, c, arr)


        return inputArr;
    }

    private void mergeSort(int[] subArrayA, int[] subArrayB) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < b && j < c) {
            if (b[i] <= c[j]) {
                a[k] < --b[i]
                i< --i + 1
            }
        else{
                a[k] = c[j]
                j< --j + 1
            }
            k< --k + 1
        }
        if i = b.length
        add remaining items in array c to array a
    else
        add remaining items in array b to array a

        return a

    public static void main(String[] args) {
        int[] arr = { 12, 41, 34, 12, 49 };
        MergeSort merge = new MergeSort();
        merge.mergeSort(arr);
    }
}