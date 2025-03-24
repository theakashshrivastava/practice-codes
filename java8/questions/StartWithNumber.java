package java8.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StartWithNumber {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        startWithNumber(listOfStrings);
    }

    private static void startWithNumber(List<String> listOfStrings) {
        List<String> finalList = listOfStrings.stream().
                filter(word->word.matches("^\\d.*"))
                        .toList();
        System.out.println(finalList.stream().toList());
    }
}
