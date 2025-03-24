package interviews.questions.string.and.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class CharRepeat {
    public static void main(String[] args) {
        String s = "Java articles are awesome";
        printFirstNonRepChar(s);
    }

    private static void printFirstNonRepChar(String s) {
        List<String> ch = Arrays.stream(s.toLowerCase().replaceAll("[ ]","").split(""))
                .collect(Collectors.toList());
        System.out.println(ch);

        List<String> frequencyChar =
                ch.stream()
                        .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                        .entrySet().stream()
                        .map(e->e.getKey() + ":" + e.getValue())
                        .collect(Collectors.toList());
        Set<String> frequencyChars = new LinkedHashSet<>(frequencyChar);
        System.out.println(frequencyChars);
    }
}
