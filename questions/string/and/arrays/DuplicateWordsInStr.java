package interviews.questions.string.and.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateWordsInStr {
    public static void printDuplicateWords(String s)
    {
        Arrays.stream(s.toLowerCase().split("\\W+"))
                .collect(Collectors.toMap(w -> w, w -> 1, Integer::sum))
                .entrySet().forEach(System.out::println);
    }

    public static void main(String[] args) {
        String s = "This is a test. This test is easy.";
        printDuplicateWords(s);
    }
}
