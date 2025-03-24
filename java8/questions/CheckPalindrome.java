package java8.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "MADAM ISI ABA ABB DED";
        checkPalindrome(s);
    }

    private static void checkPalindrome(String s) {
        List<String> s2 = new ArrayList<>(Arrays.asList(s.split(" ")));
        System.out.println(s2);

        List<String> result2 = s2.stream()
                .filter(word -> word.contentEquals(new StringBuilder(word).reverse()))
                        .collect(Collectors.toList());
        System.out.println(result2);
    }
}