package interviews.questions.collector.framework.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Demo {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "bat", "ball", "cat", "dog", "elephant");

                words.stream().collect(Collectors.groupingBy(String::length,toList()))
                        .forEach((k,v)->{
                            System.out.println("Key: "+k+" Value: "+v);
                        });


                words.stream().collect(Collectors.toMap(Function.identity(), String::length))
                                .entrySet().forEach(System.out::println);

        String input = "banana";
                input.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().forEach(System.out::println);
    }
}
