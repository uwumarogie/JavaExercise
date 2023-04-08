package SetOperations;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetOperationTest {

    @Test
    public void testUnion() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        Set<Integer> result = SetOperation.union(set1, set2);

        assertEquals(expected, result, "Union of set1 and set2 should match expected");
    }

    @Test
    public void testIntersection() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> expected = new HashSet<>(Collections.singletonList(3));

        Set<Integer> result = SetOperation.intersection(set1, set2, set3);

        assertEquals(expected, result, "Intersection of set1, set2, and set3 should match expected");
    }

    @Test
    public void testDifference() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> expected = new HashSet<>(Collections.singletonList(1));

        Set<Integer> result = SetOperation.difference(set1, set2, set3);

        assertEquals(expected, result, "Difference of set1, set2, and set3 should match expected");
    }

    @Test
    public void testUnionWithEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> expected = new HashSet<>();

        Set<Integer> result = SetOperation.union(set1, set2);

        assertEquals(expected, result, "Union of empty sets should be empty");
    }

    @Test
    public void testIntersectionWithEmptySets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> expected = new HashSet<>();

        Set<Integer> result = SetOperation.intersection(set1, set2);

        assertEquals(expected, result, "Intersection with empty set should be empty");
    }

    @Test
    public void testDifferenceWithEmptySet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3));

        Set<Integer> result = SetOperation.difference(set1, set2);

        assertEquals(expected, result, "Difference with empty set should be the same as original set");
    }
}
