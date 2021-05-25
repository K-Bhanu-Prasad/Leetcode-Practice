package main.java;

import java.util.stream.IntStream;

public class IsPangram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(s.toUpperCase()));
    }

    private static boolean isPangram(final String s) {
        return IntStream.rangeClosed(65, 90).allMatch(ch -> s.indexOf((char) ch) != -1);
    }
}
