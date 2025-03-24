package collections.practice.set;

import java.util.*;
import java.util.stream.Collectors;

public class CountUniqueWords {
    public static void uniqueWords(String s)
    {
        Set<String> uniqueSet1 = new HashSet<>(Arrays.asList(s.split(",")));
        StringTokenizer st = new StringTokenizer(s, ",");
        Set<String> uniqueSet = new HashSet<>();
        while(st.hasMoreTokens())
        {
            uniqueSet.add(st.nextToken());
        }
        System.out.println("Unique words in the string are: ");
        uniqueSet.forEach(System.out::println);
        System.out.println("Count of unique words in the string are: "+uniqueSet1.size());
        System.out.println(uniqueSet1);
    }
    public static void main(String[] args) {
        String s = "Chennai,Mumbai,Delhi,Mumbai,Chennai,Bangalore,Pune,Gwalior,Pune";
        uniqueWords(s);
    }
}
