package SumUniqueNumber;

import java.util.*;
import java.util.stream.Collectors;

public class SumUniqueNumber {

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 3, 2};
        int result1 = sumOfUnique(nums1);
        System.out.println("sumOfUnique(nums1) = " + result1); // Expected output: 4

        // Test case 2
        int[] nums2 = {1, 1, 1, 1, 1};
        int result2 = sumOfUnique(nums2);
        System.out.println("sumOfUnique(nums2) = " + result2); // Expected output: 0

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
        System.out.println("sumOfUnique(nums6) " + result6); // Expected output: Sum of unique elements: 18

        // Test case 7
        int[] nums7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int result7 = sumOfUnique(nums7);
        System.out.println("sumOfUnique(num7): " + result7); // Expected output: Sum of unique elements: 120
    }


    public static int sumOfUnique(int[] nums) {

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return removeNonUniqueNumbers(list).stream().reduce(0, Integer::sum);
    }

    public static List<Integer> removeNonUniqueNumbers(List<Integer> list) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (frequencyMap.get(num) == 1) {
                result.add(num);
            }
        }

        return result;
    }
}
