package java8.questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        findDuplicate(listOfIntegers);
    }

    private static void findDuplicate(List<Integer> listOfIntegers) {
        Map<Integer,Integer> m1 = listOfIntegers.stream().collect(Collectors.toMap(
                x -> x,
                x->1,
                Integer::sum,
                LinkedHashMap::new));
        m1.forEach((k,v) -> {
            if(v > 1) {
                System.out.println("Duplicate element: " + k + " count: " + v);
            }
        });

    }
}
