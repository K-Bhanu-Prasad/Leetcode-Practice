package main.java;

public class LargestEvenWordInSentence {
    public static void main(String[] args) {
        String result = getLargestEvenWordInSentence("Amazon is the best company");
        System.out.println(result);
    }

    private static String getLargestEvenWordInSentence(String s) {
        String largestWord = "";
        for (String word : s.split("\\s+")) {
            if (word.length() > largestWord.length() && word.length() % 2 == 0) largestWord = word;
        }
        return largestWord;
    }
}
