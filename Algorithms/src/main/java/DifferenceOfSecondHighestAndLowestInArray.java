package main.java;

public class DifferenceOfSecondHighestAndLowestInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 7, 2, 8, 10};
        int result = getDifferenceOfSecondHighestAndLowestInArray(arr);
        System.out.println(result);
    }

    private static int getDifferenceOfSecondHighestAndLowestInArray(int[] arr) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int firstLowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = value;
            }
            if (value < firstLowest) {
                secondLowest = firstLowest;
                firstLowest = value;
            }
        }
        return secondHighest - secondLowest;
    }
}
