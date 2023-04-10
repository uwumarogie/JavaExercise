package MissingNumber;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1, 0})); //2
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})); // 8
        System.out.println(missingNumber(new int[]{6, 5, 3, 2, Integer.MAX_VALUE})); // 0
        System.out.println(missingNumber(new int[]{3, 0, 1})); // 2

    }

    public static int missingNumber(int[] array) {

        Arrays.sort(array); // sorting the arr
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) { // check condition
                return i;
            }
            if (i == array.length - 1) { // checking condition
                return i + 1;
            }

        }
        return 0;
    }
}
