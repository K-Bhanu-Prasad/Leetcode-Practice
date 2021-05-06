package main.java;

public class RemoveDuplicatesFromArray {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i == nums.length-1) {
                nums[j++] = nums[i];
            }
            else if(nums[i] != nums[i+1]){
                nums[j++]= nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 3, 3, 4, 4, 4};
        int len = removeDuplicates(nums);
        System.out.println("length is: " + len);
        for (int i = 0; i < len; i++) System.out.println(nums[i]);
    }

}
