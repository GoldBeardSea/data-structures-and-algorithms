package Challenges.Sorts;

public class QuickSort {

    private static int quickPart(int[] arr, int low, int high) {
        int part = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
          if (arr[j] <= part) {
              i++;
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
          }

        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int part = quickPart(arr, low, high);
            quickSort(arr, low, part - 1);
            quickSort(arr, part + 1, high);
        }
        return arr;
    }

}
