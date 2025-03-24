package java8.questions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesRemoval {
    public static void main(String[] args) {
        String inputString = "geEksforGEeks";
        printDuplicateCharacters(inputString);
    }

    private static void printDuplicateCharacters(String inputString) {
        List<Character> charList = inputString.chars().mapToObj(c -> (char) c).toList();
        Set<String> s1 = charList.stream().collect(Collectors.toMap(
                        c -> c,
                        c -> 1,
                        Integer::sum,
                        LinkedHashMap::new
                )).entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey().toString())
                .collect(Collectors.toSet());
        for (String x : s1) {
            System.out.println(x);
        }
    }
}
