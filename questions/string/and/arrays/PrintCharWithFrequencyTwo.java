package interviews.questions.string.and.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintCharWithFrequencyTwo {
    public static void main(String[] args) {
        List<String> num = Arrays.asList("a","b","s","a","p","o","a","p");

        Map<String,Integer> m1 = num
                .stream()
                .collect(Collectors.toMap(Function.identity(),
                        String->1,
                        Integer::sum));
        int max = Collections.max(m1.values());

        m1.entrySet().stream()
                .filter(entry -> entry.getValue() < max)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
