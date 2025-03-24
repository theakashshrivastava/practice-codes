package collections.practice.map;

import java.util.*;
import java.util.stream.Collectors;

public class CountFrequencyOfCharacters {
    public static void countFrequency(List<Character> x)
    {
        Map<Character,Integer> m1;
        m1 = x.stream().collect(Collectors.toMap(
                y->y,
                y->1,
                Integer::sum,
                LinkedHashMap::new
        ));
        m1.forEach((k,v)->{
            if(v==1){
                System.out.println("Non-repeating : ");
                System.out.println("Character: "+k+" Frequency: "+v);
            }
            else {
                System.out.println("Repeating : ");
                System.out.println("Character: "+k+" Frequency: "+v);
            }
        });
    }
    public static void main(String[] args) {
        String s = "Java articles are awesome";
        List<Character> x = s.toLowerCase()
                .replaceAll(" ","")
                .chars()
                .mapToObj(c->(char) c)
                .toList();
        CountFrequencyOfCharacters.countFrequency(x);
    }
}
