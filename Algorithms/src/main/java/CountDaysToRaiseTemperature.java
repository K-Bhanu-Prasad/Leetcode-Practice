package main.java;

/**
 * Print no.of days it took to raise a temperature from the current day temperature for each day.
 * If not found print -1.
 * <p>
 * input:   [23, 24, 25, 19, 18, 26, 3]
 * output:  [1,  1,  3,  2,  1, -1, -1]
 */
public class CountDaysToRaiseTemperature {
    public static void main(String[] args) {
        int[] temp = new int[]{23, 24, 25, 19, 18, 26, 3};

        for (int i = 0; i < temp.length; i++) {
            int count = 0;
            int j;
            for (j = i + 1; j < temp.length; j++) {
                count++;
                if (temp[j] > temp[i]) break;
            }
            if (j == temp.length) count = -1;
            System.out.print(count + " ");
        }
    }
}
