package interviews.questions.string.and.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsFrequency {
    public static void main(String[] args) {
        String s = "This is a test11. This test is easy.";
        countFrequency(s);
    }

    private static void countFrequency(String s) {
        List<String> words1 = Arrays.stream(s.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" "))
                .collect(Collectors.toList());
        System.out.println(words1);
        List<String> frequency = words1.stream().
                collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .map(e -> e.getKey() + ":" + e.getValue())
                        .collect(Collectors.toList());
        System.out.println(frequency);
    }
}
