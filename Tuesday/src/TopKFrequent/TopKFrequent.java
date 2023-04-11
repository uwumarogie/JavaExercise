package TopKFrequent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequent {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2))); // [1,2]
        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));// [1]
        System.out.println(Arrays.toString(topKFrequent(new int[]{-1, 12, 12, 12, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE}, 2))); // [12, Integer.MAX_VALUE]
    }


    public static int[] topKFrequent(int[] nums, int k) {
        return Arrays.stream(nums)
                .boxed()
                // Creating a HashMap<Integer, Long>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                // Sort the Entry from the entrySet
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
