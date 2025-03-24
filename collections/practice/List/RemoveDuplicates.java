package collections.practice.List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> a1 = Arrays.asList(1,2,3,4,3,2,1,4,5,6,1,7,8);
        //Remove duplicates
        a1 = a1.stream().distinct().toList();

        Set<Integer> s1 = new HashSet<>(a1);
        System.out.println(a1);
        System.out.println(s1);
    }
}
