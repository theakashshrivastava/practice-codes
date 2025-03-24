package java8.questions;

import java.util.*;
import java.util.stream.Collectors;

public class MostRepeated {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        mostRepeated(listOfStrings);
    }

    private static void mostRepeated(List<String> listOfStrings) {
        String mostRepeated = listOfStrings.stream()
                .collect(Collectors.toMap(
                        s->s,
                        s->1,
                        Integer::sum,
                        LinkedHashMap::new))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("Most Repeated: " + mostRepeated);
    }
}
