package interviews.questions.string.and.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class ReverseEachWordInString {
    public static void reverseStringWords(String s)
    {
        Arrays.stream(s.split(" "))
                .map(i-> new StringBuilder(i).reverse().toString())
                .map(i-> i+" ")
                .forEach(System.out::print);
    }

    public static void main(String[] args) {
        String s = "Java is great and fun";
        reverseStringWords(s);
    }
}
