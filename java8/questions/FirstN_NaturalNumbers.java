package java8.questions;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FirstN_NaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        sumFirst_N_NaturalNumbers(n);
    }

    private static void sumFirst_N_NaturalNumbers(int n) {
        List<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().toList();
        System.out.println(numbers);

        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println(sum);
    }
}
