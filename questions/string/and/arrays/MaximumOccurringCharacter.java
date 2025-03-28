package interviews.questions.string.and.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class MaximumOccurringCharacter {
    public static void maxOccurrence(String s)
    {

        Arrays.stream(s.split("")).collect(Collectors.groupingBy(c->c.charAt(0),Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        String s = "AAAAIEIGIEIIIAAAABBACDDEAEBBBFFFHHIIIIIRRTIIIJJJJFFWEEfJJEKKKEIDKGNECNGERGMKFFGGGGFEEEBBB";
        maxOccurrence(s);
    }
}
