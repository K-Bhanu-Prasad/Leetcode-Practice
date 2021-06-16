package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
    Sort array with minimum and maximum alternately
    Input  = [2,4,6,1,9,7,28]
    Output = [1,28,2,9,4,7,6]

 */
public class ArrangeInAscDesc {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 6, 1, 9, 29 };
        List<Integer> integers = sortAndGet(arr);
        integers.stream().forEach(val -> System.out.print(val + " "));
    }

    private static List<Integer> sortAndGet(final int[] arr) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        IntStream.range(0, arr.length / 2).forEach(index -> {
            list.add(arr[index]);
            list.add(arr[arr.length - index - 1]);
            if (index == (arr.length / 2) - 1 && arr.length % 2 != 0)
                list.add(arr[index + 1]);
        });
        return list;
    }

}
