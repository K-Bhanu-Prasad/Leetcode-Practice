package main.java;

/**
 * Given an array of integers, determine the number of ways the entire array be split into two non-empty subarrays, left and right,
 * such that the sum of elements in the left subarray is greater than the sum of elements in the right subarray.
 * <p>
 * Example
 * <p>
 * arr = [10, 4, -8, 7]
 * <p>
 * There are three ways to split it into two non empty subarrays:
 * <p>
 * 1. [10] and [4.-8. 73. left sum= 10, right sum=13
 * <p>
 * 2. [10, 4] and [-8. 7) left sum= 10+4 = 14, right sum = -8+7=-1
 * <p>
 * 3. [10, 4.-8] and [7] left sum = 6, right sum = 7
 * <p>
 * The first two satisfy the condition that left sum > right sum, so the return value should be 2
 */
public class ArraySplitting {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 4, -8, 7};
        System.out.println(printArraySplittingCount(arr));
    }

    private static int printArraySplittingCount(final int[] arr) {

        int count = 0;
        int[] prefixSum = new int[arr.length];
        int[] suffixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        suffixSum[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (prefixSum[i] > suffixSum[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
