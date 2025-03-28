package interviews.questions.string.and.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountFrequencyOfWords {
    public static void countFrequency(String s)
    {
        Arrays.stream(s.toLowerCase().split("\\W+"))
                .collect(Collectors.toMap(w -> w, w -> 1, Integer::sum))
                .entrySet().forEach(System.out::println);
    }
    public static void main(String[] args) {
        String s = "This is a test. This test is easy.";
        countFrequency(s);
    }
}
