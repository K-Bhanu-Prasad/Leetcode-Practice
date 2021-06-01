package main.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IsStringHavingSamePattern {
    public static void main(String[] args) {
        String s = "abcabcabcabc";
        System.out.println(isStringHavingSamePattern(s));
    }

    private static boolean isStringHavingSamePattern(String s) {
        return IntStream.rangeClosed(1, s.length() / 2).mapToObj(index -> s.split("(?<=\\G.{" + index + "})"))
                .anyMatch(obj -> Arrays.stream(obj).distinct().count() == 1);
    }
}
