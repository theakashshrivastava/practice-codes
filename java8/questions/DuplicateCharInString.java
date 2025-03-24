package java8.questions;

import java8.diamond.problem.InterfaceB;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll(" ", "").toLowerCase();
        printDuplicateCharacters(inputString);
    }

    private static void printDuplicateCharacters(String inputString) {
        List<String> s1 = inputString.chars().mapToObj(c -> String.valueOf((char) c)).toList();
        Map<String, Integer> m1 = s1.stream().collect(Collectors.toMap(
                c -> c,
                c -> 1,
                Integer::sum,
                LinkedHashMap::new
        ));
        m1.entrySet().stream().filter(e -> e.getValue() > 1).forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
