package main.java;

public class PriorityCharsInAscDesc {

    public static void main(String[] args) {
        String s = "aaabbbccc";
        System.out.println(printPriorityCharsInAscDesc(s));
    }

    private static String printPriorityCharsInAscDesc(String s) {
        StringBuilder result = new StringBuilder();
        boolean isAscendingOrder = true;
        while (!"".equals(s)) {
            if (isAscendingOrder) {
                s = getStringWithAscOrder(s, result, true);
            } else {
                s = getStringWithAscOrder(s, result, false);
            }
            isAscendingOrder = !isAscendingOrder;

        }
        return result.toString();
    }

    private static String getStringWithAscOrder(String original, StringBuilder result, boolean isAscOder) {
        String copyOriginal = original;
        StringBuilder copyResult = new StringBuilder();
        while (!"".equals(original)) {
            char ch;
            if (isAscOder) {
                ch = (char) original.chars().min().getAsInt();
            } else {
                ch = (char) original.chars().max().getAsInt();
            }
            if (!copyResult.toString().contains(ch + "")) {
                copyResult.append(ch);
                copyOriginal = copyOriginal.replaceFirst(ch + "", "");
            }
            original = original.replaceFirst(ch + "", "");
        }
        result.append(copyResult.toString());
        return copyOriginal;
    }

}
