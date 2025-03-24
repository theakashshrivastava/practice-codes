package java8.questions;

import java.util.Arrays;
import java.util.List;

public class GetLast {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        getLast(listOfStrings);
    }

    private static void getLast(List<String> listOfStrings) {
        String word = listOfStrings.stream()
                .reduce((first, second) -> second )
                .orElse(null);
        System.out.println("Last word: " + word);

    }
}
