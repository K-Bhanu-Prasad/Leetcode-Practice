package main.java;

public class RunningSumOfArray {

    public static void main(String[] args) {
        int[] result = runningSum(new int[]{1, 2, 3, 4});
        for (int element : result) {
            System.out.println(element);
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}

