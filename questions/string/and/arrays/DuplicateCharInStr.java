package interviews.questions.string.and.arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharInStr {
    public static void printRepeatingChars(String s)
    {
        s.replaceAll(" ", "").chars().mapToObj(i -> (char)i)
                .collect(Collectors.toMap(c -> c, c -> 1, Integer::sum))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .forEach(e -> System.out.println(e.getKey()));
    }
    public static void main(String[] args) {
        String s = "madam";
        printRepeatingChars(s);
    }
}
