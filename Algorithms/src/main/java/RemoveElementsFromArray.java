package main.java;

public class RemoveElementsFromArray {
    public static int removeElements(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) nums[j++] = nums[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 3, 3, 4, 4, 3, 4};
        int len = removeElements(nums, 4);
        System.out.println("length is: " + len);
        for (int i = 0; i < len; i++) System.out.print(nums[i] +" ");
    }

}
