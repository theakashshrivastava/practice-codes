package collections.practice.arrays;

import java.util.List;
import java.util.stream.IntStream;

public class ReverseIterateList {
    public static void main(String[] args) {
        List<String> m1 = List.of("geeks", "for", "geeks", "contribute",  "practice");

        IntStream.range(0,m1.size())
                .map(i -> m1.size()-1-i)
                .forEach(i -> System.out.println(m1.get(i)));
    }
}
