package interviews.questions.string.and.arrays;

import java.util.Arrays;
import java.util.StringTokenizer;

public class CountWordsInString {
    public static void countStringWords(String s)
    {
        long count = Arrays.stream(s.split("\\W+")).toList().size();
        System.out.println("Number of words in the string are: " + count);
    }

    public static void main(String[] args) {
        String s = "Java is great and Java is fun";
        countStringWords(s);
    }
}
