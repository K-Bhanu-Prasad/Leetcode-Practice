package main.java;

public class TrianglePattern {

    /*  input       n = 3
        output       1
                    212
                   32123
     */
    public static void main(String[] args) {
        printPattern(3);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1, k = n; j <= n + i - 1; j++) {
                if (j < n - i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(k);
                }
                if (j >= n)
                    k++;
                else
                    k--;
            }
            System.out.println();
        }
    }
}
