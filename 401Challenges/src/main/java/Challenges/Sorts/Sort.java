package Challenges.Sorts;

public class Sort {

    public static int[] insertSort(int[] arr) {
        if (arr == null) {
            System.out.println("Empty Arr");
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while ((j > -1) && (arr[j] > temp)) {
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j+1] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = { 12, 41, 34, 12, 49 };

        Sort.insertSort(arr);

        for (int num: arr) {
            System.out.println(num);
        }
    }
}
