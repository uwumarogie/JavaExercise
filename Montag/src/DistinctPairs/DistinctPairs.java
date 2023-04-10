package DistinctPairs;

import java.util.*;
import java.util.stream.Collectors;

public class DistinctPairs {


    public static void main(String[] args) {
        System.out.println(findDistinctPairs(new int[0], 8)); // ""
        System.out.println(findDistinctPairs(new int[]{1, 2, 3, 4, 5, 6}, 7)); // "[[1,6], [2,5], [3,4]]"
        System.out.println(findDistinctPairs(new int[]{-12, -12, -1, Integer.MIN_VALUE}, 8)); // "There is no Pairs"
        System.out.println(findDistinctPairs(new int[]{-1, -7, -12, 8,}, -8)); // "[[-1,-7]]"

    }

    public static String findDistinctPairs(int[] array, int target) {
        if (array.length == 0) return "";

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            for (int k : array) {
                if (array[i] + k == target) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(array[i]);
                    pair.add(k);
                    map.put(i, pair);
                }
            }
        }

        Collection<List<Integer>> res = map.values();
        if (res.isEmpty()) return "There are no pairs";

        return res.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

}
