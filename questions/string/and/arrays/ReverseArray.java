package interviews.questions.string.and.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void reverseFun(int[] a)
    {
        IntStream.range(0, a.length)
                .map(i -> a[a.length - 1 - i])
                .mapToObj(x -> x + " ")
                .forEach(System.out::print);
    }

    public static void main(String[] args) {
        int[] a = {17,3,13,4,95};
        reverseFun(a);
    }
}
