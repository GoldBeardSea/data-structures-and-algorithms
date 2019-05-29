package Challenges;

public class ArrayShift {
    public static int[] insertShiftArray(int[] inputArray, int num) {
        int[] result = new int[inputArray.length + 1];
        for (int i = 0; i < inputArray.length / 2 + 1; i++) {
            result[i] = inputArray[i];

        }
        if (result.length % 2 == 0) {
            result[(int) Math.ceil(inputArray.length / 2) + 1] = num;
            for (int i = (int) Math.ceil(inputArray.length / 2) + 2; i < result.length; i++)
                result[i] = inputArray[i - 1];

        } else {
            result[(int) Math.ceil(inputArray.length / 2)] = num;
            for (int i = (int) Math.ceil(inputArray.length / 2) + 1; i < result.length; i++)
                result[i] = inputArray[i - 1];
        }
        return result;
    }

}
