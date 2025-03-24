package java8.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        reverseEachWord(str);
    }

    private static void reverseEachWord(String str) {
        List<String> eStr = new ArrayList<>(Arrays.asList(str.split(" ")));

        List<String> fStr = eStr.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(String.join(" ", fStr));
    }
}
