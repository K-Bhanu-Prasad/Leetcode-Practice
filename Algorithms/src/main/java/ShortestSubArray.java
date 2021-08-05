package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a non-empty array of non-negative integers nums.
 * The degree of this array is defined as the maximum frequency of any one of its elements.
 * <p>
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums,
 * that has the same degree as nums.
 * <p>
 * Input: nums = [1,2,2,3,1]
 * Output: 2
 * Explanation:
 * The input array has a degree of 2 because both elements 1 and 2 appear twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 */
public class ShortestSubArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums));
    }

    public static int findShortestSubArray(int[] nums) {
        int order = findOrderOfArray(nums);
        List<int[]> subArrays = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int[] subArray = new int[j + 1 - i];
                for (int k = i, temp = 0; k <= j; k++) {
                    subArray[temp++] = nums[k];
                }
                if (findOrderOfArray(subArray) == order) {
                    subArrays.add(subArray);
                }
            }
        }
        return subArrays.stream().mapToInt(array -> array.length).min().orElse(0);
    }

    private static int findOrderOfArray(int[] nums) {
        final Map<Integer, Integer> map = Arrays.stream(nums).boxed().collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum));
        return map.values().stream().mapToInt(Integer::intValue).max().orElse(0);
    }
}
