package main.java;

public class CountSequenceCharsInString {
    public static void main(String[] args) {
        String s = "aaabbaaccccc";
        System.out.println(countSequenceCharsInString(s));
    }

    private static String countSequenceCharsInString(final String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        char ch = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (ch != s.charAt(i)) {
                result.append(ch).append(count);
                count = 1;
                ch = s.charAt(i);
            } else {
                count++;
            }
        }
        result.append(ch).append(count);
        return result.toString();
    }
}
