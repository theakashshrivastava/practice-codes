package java8.questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        firstRepeatedChar(inputString);
    }

    private static void firstRepeatedChar(String inputString) {
    List<Character> m1 = inputString.chars().mapToObj(c->(char)c).toList();

    Character repChar = m1.stream()
            .collect(Collectors.toMap(
                    c->c,
                    c->1,
                    Integer::sum,
                    LinkedHashMap::new
            )).entrySet().stream().filter(e->e.getValue()==1).findFirst().get().getKey();
        System.out.println("First Non Repeated Character: " + repChar);
    }
}
