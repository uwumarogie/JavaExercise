package HeightChecker;

import java.util.Arrays;

public class HeightChecker {

/*

A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].


Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation:
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
*/

    public static void main(String[] args) {

        System.out.println(heightChecker(new int[]{1,1,3,5,4})); // 2
        System.out.println(heightChecker(new int[0])); // 0
        System.out.println(heightChecker(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, 33,45,22})); // 3
        System.out.println(heightChecker(new int[]{3,2,1,0,1,2,5,4,3,6})); // 7
    }

    public static int heightChecker(int[] heights) {

        if(heights.length == 0) return 0;

        int[] expected = Arrays.stream(heights).sorted().toArray();

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}
