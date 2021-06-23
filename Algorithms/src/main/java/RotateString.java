package main.java;

public class RotateString {
    public static void main(String[] args) {
        String s = "ABCDE";
        String result = rotateString(s, 1, false);
        System.out.println(result);
    }

    private static String rotateString(String s, int n, boolean clockwise) {
        if (clockwise) {
            return s.substring(n) + s.substring(0, n);
        }
        return s.substring(s.length() - n) + s.substring(0, s.length() - n);
    }
}
