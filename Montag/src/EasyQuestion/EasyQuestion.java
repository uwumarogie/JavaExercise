package EasyQuestion;

public class EasyQuestion {
    public static void main(String[] args) {
        System.out.println(sumOfEvenNumber(new int[]{1, 2, 3, 4, 5, -121221, -1312327, 6})); // 12
        System.out.println(sumOfEvenNumber(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE})); // -1
        System.out.println(sumOfEvenNumber(new int[0])); // 0
        System.out.println(findMax(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 1232322424, -2323232})); // Integer.MAX_VALUE

    }

    public static int sumOfEvenNumber(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MAX_VALUE || nums[i] == Integer.MIN_VALUE) {
                return -1;
            }
            if (nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int findMax(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                max = nums[i];
            }
        }
        return max;
    }

}
