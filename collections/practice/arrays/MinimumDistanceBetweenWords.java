package collections.practice.arrays;

import java.util.List;
import java.util.stream.IntStream;

public class MinimumDistanceBetweenWords {
    public static void main(String[] args) {
        String[] s = {"geeks", "for", "geeks", "contribute",  "practice"};

        List<String> m1 = List.of(s);
        String word1 = "geeks";
        String word2 = "practice";

        int x = IntStream.range(0,m1.size())
                .map(i -> m1.size()-1-i)
                .filter(i -> m1.get(i).equals(word1))
                .findFirst()
                .orElse(-1);

        int y = IntStream.range(0,m1.size())
                .filter(i -> m1.get(i).equals(word2))
                .boxed().reduce((first,second)->second)
                .orElse(-1);

        System.out.println("Minimum distance between " + word1 + " and " + word2 + " is " + Math.abs(x-y));
    }
}
