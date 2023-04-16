package SetOperations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> second = new HashSet<>(Arrays.asList(1, 2, 4));
        System.out.println(union(first, second));
    }

    @SafeVarargs
    public static <T> Set<T> union(Set<T>... sets) {
        Set<T> result = new HashSet<>();
        for (Set<T> set : sets) {
            result.addAll(set);
        }
        return result;
    }

    @SafeVarargs
    public static <T> Set<T> intersection(Set<T>... sets) {
        Set<T> result = new HashSet<>();
        if (sets.length > 0) {
            result.addAll(sets[0]);
            for (int i = 1; i < sets.length; i++) {
                result.retainAll(sets[i]);
            }
        }
        return result;
    }

    @SafeVarargs
    public static <T> Set<T> difference(Set<T> first, Set<T>... sets) {
        Set<T> result = new HashSet<>(first);
        for (Set<T> set : sets) {
            result.removeAll(set);
        }
        return result;
    }


}
