package ReverseArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Test
    public void testReverseArray() {
        // Test case 1: Odd length array
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 4, 3, 2, 1};
        ReverseArray.reverseArray(arr1);
        Assertions.assertArrayEquals(expected1, arr1, "Array should be reversed");

        // Test case 2: Even length array
        int[] arr2 = {6, 7, 8, 9};
        int[] expected2 = {9, 8, 7, 6};
        ReverseArray.reverseArray(arr2);
        Assertions.assertArrayEquals(expected2, arr2, "Array should be reversed");

        // Test case 3: Empty array
        int[] arr3 = {};
        int[] expected3 = {};
        ReverseArray.reverseArray(arr3);
        Assertions.assertArrayEquals(expected3, arr3, "Empty array should remain unchanged");

        // Test case 3: With big values
        int[] arr4 = {Integer.MAX_VALUE, -1, 2, 1, -23, Integer.MIN_VALUE};
        int[] expected4 = {Integer.MIN_VALUE, -23, 1, 2, -1, Integer.MAX_VALUE};
        ReverseArray.reverseArray(arr4);
        Assertions.assertArrayEquals(expected4, arr4, "Array should be reversed.");
    }
}
