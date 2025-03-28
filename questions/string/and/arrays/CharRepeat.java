package interviews.questions.string.and.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharRepeat {
    public static void main(String[] args) {
        String s = "Java articles are awesome";
        printFirstNonRepChar(s);
    }

    private static void printFirstNonRepChar(String s) {
        s.replaceAll(" ","")
                .toLowerCase()
                .chars().mapToObj(x->((char)x))
                .toList().stream().collect(Collectors.toMap(Function.identity(),
                                x->1,
                                Integer::sum,
                                LinkedHashMap::new))
                        .entrySet()
                .stream()
                .filter(e->(e.getValue()==1))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
