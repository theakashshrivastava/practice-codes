package interviews.questions.string.and.arrays;

import java.util.*;


public class RemoveDuplicateFromString {
    public static void removeDuplicate(String s)
    {
        List<String> s1 = Arrays.asList(s.split(" "));

        Set<String> s2 = new LinkedHashSet<>(s1);
        System.out.print(s2);

    }

    public static void main(String[] args) {
        String s = "Java is great and Java is fun and Java is powerful";
        removeDuplicate(s);
    }
}
