package main.java;

import java.util.HashSet;
import java.util.Set;

public class CountCommonElementsFromTwoSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(14);
        set2.add(15);

        countByRetainAll(set1, set2); // Efficient way
        //countByParallelStream(set1, set2); // Next efficient way
    }

    private static void countByRetainAll(final Set<Integer> set1, final Set<Integer> set2) {
        // Best efficient way is by modifying set
        set1.retainAll(set2);
        System.out.println(set1.size());
    }

    private static void countByParallelStream(final Set<Integer> set1, final Set<Integer> set2) {
        // Next efficient way is by using parallel stream than normal stream
        long count = set1.parallelStream().filter(set2::contains).count();
        System.out.println(count);
    }
}
