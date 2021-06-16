package main.java;

public class SeparateCharsNumsInString {
    public static void main(String[] args) {
        String s = "ab34cd99";
        printCharsAndNumsSeparetly(s);
    }

    private static void printCharsAndNumsSeparetly(final String s) {
        StringBuilder stringBuilder = new StringBuilder();
        s.chars().forEach(ch -> {
            if (Character.isAlphabetic(ch))
                System.out.print(Character.toChars(ch));
            else
                stringBuilder.append(Character.toChars(ch));
        });
        System.out.print(stringBuilder.toString());
    }
}
