package ReverseArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(reverseArrayUsingStream(array)));
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }

    private static int[] reverseArrayUsingStream(int[] array) {
        List<Integer> list = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        return list.stream()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

    }

}
