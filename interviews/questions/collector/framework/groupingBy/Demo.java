package interviews.questions.collector.framework.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Demo {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "bat", "ball", "cat", "dog", "elephant");

        Map<Integer,List<String>> m1 =
                words.stream().collect(Collectors.groupingBy(String::length,toList()));
        System.out.println(m1);

        Map<String,Integer> m4 = words.stream().collect(Collectors.toMap(String::toString, String::length));
        System.out.println(m4);

        String input = "banana";
        Map<Character,Integer> m2 = input.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(c -> c, Collectors.summingInt(c -> 1)));
        System.out.println(m2);
    }
}
