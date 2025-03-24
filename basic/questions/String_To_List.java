package basic.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class String_To_List {
    public static void main(String[] args) {
        String s = "Akash Shrivastava";
        List<Character> chList = s.replaceAll(" ","")
                .toLowerCase()
                .chars()
                .mapToObj(e -> (char)e)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(chList);

        String originalS1 = "Akash";
        String reverseS1 = IntStream.range(0,originalS1.length())
                .mapToObj(i -> originalS1.charAt(originalS1.length() - 1-i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("Reverse String " + reverseS1);

        List<String> s1 = Arrays.asList(s.split(" "));
        System.out.println(s1);

        String[] sArr = {"A","B","C","D"};
        List<String> sList1 = Arrays.asList(sArr);
        System.out.println(sList1);

        int[] sArr2 = {1,2,3,4};
        List<Integer> sList2 = Arrays.stream(sArr2).boxed().toList();
        System.out.println(sList2);
    }
}
