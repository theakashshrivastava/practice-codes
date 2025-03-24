package java8.questions;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondHighestFrequency {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","s","a","p","o","a","p");
        secondHighestFrequency(list);
    }

    private static void secondHighestFrequency(List<String> list) {

        String m1 = list.stream().collect(Collectors.toMap(
                c->c,c->1,Integer::sum, LinkedHashMap::new))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).skip(1)
                .findFirst().get().getKey();
        System.out.println(m1);
    }
}
