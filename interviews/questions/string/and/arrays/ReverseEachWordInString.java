package interviews.questions.string.and.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReverseEachWordInString {
    public static void reverseStringWords(String s)
    {
        List<String> s1 = new ArrayList<>(List.of(s.split(" ")));
        System.out.println(s1);

        s1.stream().map(i-> new StringBuilder(i).reverse().toString()).forEach(System.out::println);
    }

    public static void main(String[] args) {
        String s = "Java is great and fun";
        reverseStringWords(s);
    }
}
