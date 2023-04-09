package ThreeSum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threesum(nums)); // [[-1,-1,2],[-1,0,1]]
    }

    public static List<List<Integer>> threesum(int[] num) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                for (int k = 2; k < num.length; k++) {

                    List<Integer> subList = new ArrayList<>();
                    if (num[i] + num[j] + num[k] == 0) {
                        subList.add(num[i]);
                        subList.add(num[j]);
                        subList.add(num[k]);
                    }
                    res.add(subList);
                }
            }
        }

        return res.stream().distinct().collect(Collectors.toList());
    }

    public static void removeInnerListIfContainsDuplikate(List<List<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            List<Integer> innerList = list.get(i);
            if(innerList.stream().distinct().count() < list.get(i).size()) {
                list.remove(list.get(i));

            }
        }
    }


}
