package FindTheHighestProduct;

public class HighestProduct {

    public static void main(String[] args) {

        int[] nums =  {3,4,5,6,7};
        System.out.println(findHighestProduct(nums)); // 42
        System.out.println(findHighestProduct(new int[0])); // 0
        System.out.println(findHighestProduct(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE})); //1
        System.out.println(findHighestProduct(new int[]{-12, -12, -12, -42, -100})); // -144




    }


    public static int findHighestProduct(int[] nums) {
        int highest1 = Integer.MIN_VALUE;
        int highest2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > highest1) {
                highest2 = highest1;
                highest1 = num;
            } else if (num > highest2) {
                highest2 = num;
            }
        }

        return  highest1 * highest2;
    }

}
