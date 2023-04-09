package ThreeSum;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threesum(nums)); // [[-1,-1,2],[-1,0,1]]
    }

    public static List<List<Integer>> threesum(int[] num) {
        Set<List<Integer>> res = new HashSet<>();
        if (num.length == 0) return new ArrayList<>(res);
        Arrays.sort(num);


        for (int i = 0; i < num.length - 2; i++) {
            int j = i + 1;
            int k = num.length - 1;
            while (j < k) {
                int sum = num[i] + num[j] + num[k];
                if (sum == 0) res.add(Arrays.asList(num[i], num[j++], num[k--]));
                else if (sum > 0) k--;
                else if (sum < 0) j++;
            }

        }
        return new ArrayList<>(res);

    }


    public static void removeInnerListIfContainsDuplikate(List<List<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            List<Integer> innerList = list.get(i);
            if (innerList.stream().distinct().count() < list.get(i).size()) {
                list.remove(list.get(i));

            }
        }
    }


}
