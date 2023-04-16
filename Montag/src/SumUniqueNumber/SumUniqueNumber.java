package SumUniqueNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SumUniqueNumber {

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 3, 2};
        int result1 = sumOfUnique(nums1);
        System.out.println("sumOfUnique(nums1) = " + result1); // Expected output: 6

        // Test case 2
        int[] nums2 = {1, 1, 1, 1, 1};
        int result2 = sumOfUnique(nums2);
        System.out.println("sumOfUnique(nums2) = " + result2); // Expected output: 1

        // Test case 3
        int[] nums3 = {1, 2, 3, 4, 5};
        int result3 = sumOfUnique(nums3);
        System.out.println("sumOfUnique(nums3) = " + result3); // Expected output: 15

        // Test case 4
        int[] nums4 = {};
        int result4 = sumOfUnique(nums4);
        System.out.println("sumOfUnique(nums4) " + result4); // Expected output: Sum of unique elements: 0

        // Test case 5
        int[] nums5 = {5};
        int result5 = sumOfUnique(nums5);
        System.out.println("sumOfUnique(nums5) " + result5); // Expected output: Sum of unique elements: 5

        // Test case 6
        int[] nums6 = {1, 2, 3, 4, 4, 5, 6, 6, 7};
        int result6 = sumOfUnique(nums6);
        System.out.println("sumOfUnique(nums6) " + result6); // Expected output: Sum of unique elements: 28

        // Test case 7
        int[] nums7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int result7 = sumOfUnique(nums7);
        System.out.println("sumOfUnique(num7): " + result7); // Expected output: Sum of unique elements: 120
    }


    public static int sumOfUnique(int[] nums) {

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return new HashSet<>(list).stream().reduce(0, Integer::sum);
    }
}
