package collections.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestStringViaStreams {
    public static void longestString(List<String> s)
    {
                s.stream().max(Comparator.comparingInt(String::length))
                        .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        List<String> sList = Arrays.asList("Gwalior","Delhi","Pune","Mumbai","Bangalore");
        longestString(sList);
    }
}
