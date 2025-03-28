package interviews.questions.string.and.arrays;

import java.util.*;
import java.util.stream.Collectors;


public class RemoveDuplicateFromString {
    public static void removeDuplicate(String s)
    {
        Arrays.stream(s.split(" "))
                        .distinct()
                        .toList()
                        .stream()
                        .map(i-> i + " ")
                .forEach(System.out::print);
    }

    public static void main(String[] args) {
        String s = "Java is great and Java is fun and Java is powerful";
        removeDuplicate(s);
    }
}
