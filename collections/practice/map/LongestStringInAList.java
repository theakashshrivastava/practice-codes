package collections.practice.map;

import java.util.*;
import java.util.stream.Collectors;

public class LongestStringInAList {
    public static void longestString(List<String> s)
    {
        Map<String,Integer>  m2 = s.stream().collect(Collectors.toMap(x->x, String::length));
        int maxVal = Collections.max(m2.values());
        m2.forEach((k,v)->{
            if(v == maxVal)
            {
                System.out.println("Longest String in the list is: "+ k);
            }
        });
        /** Another Approach **/
        s.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::println);
    }
    public static void main(String[] args) {
        List<String> sList = Arrays.asList("Gwalior","Delhi","Pune","Mumbai","Bangalore","Goa");
        longestString(sList);
    }
}
