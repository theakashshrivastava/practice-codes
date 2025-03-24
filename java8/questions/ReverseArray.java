package java8.questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        reverseArray(array);
    }

    private static void reverseArray(int[] array) {
        List<Integer> arr1 = Arrays.stream(array).boxed().toList();
        List<Integer> arr2 =
                arr1.stream().map(i -> arr1.get(arr1.size() - arr1.indexOf(i) - 1)).collect(Collectors.toList());
        System.out.println(arr2);
    }
}
