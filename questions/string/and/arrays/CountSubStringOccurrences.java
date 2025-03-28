package interviews.questions.string.and.arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CountSubStringOccurrences {
    public static void countFrequency(String s)
    {
        Arrays.stream(s.split("\\W+"))
                .collect(Collectors.toMap(w -> w, w -> 1, Integer::sum, LinkedHashMap::new))
                .entrySet().stream().filter(e-> "Java".equals(e.getKey()))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        String s = "Java is great. Java is fun. Java is powerful.";
        countFrequency(s);
    }
}
