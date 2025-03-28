package interviews.questions.string.and.arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountVowelsConsonants {
    public static void countVowAndCons(String s)
    {
        s.replaceAll("\\W", "")
                .toLowerCase()
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.partitioningBy(
                        c -> "aeiou".indexOf(c) != -1,
                        Collectors.summingInt(c -> 1)
                )).entrySet()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        String s = "Hello world";
        countVowAndCons(s);
    }
}
