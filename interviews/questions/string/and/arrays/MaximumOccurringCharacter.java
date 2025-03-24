package interviews.questions.string.and.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class MaximumOccurringCharacter {
    public static void maxOccurrence(String s)
    {
        List<Character> aList = new ArrayList<>();
        for(Character x : s.toCharArray())
            aList.add(x);

        Map<Character,Integer> m1 = aList.stream().collect(Collectors.toMap(x->x,x->1,Integer::sum));
        int max = Collections.max(m1.values());
        for(Map.Entry<Character,Integer> x : m1.entrySet())
        {
            if(x.getValue()==max)
                System.out.println("Max occurring char is\n" + x.getKey() + ":" + x.getValue());
        }
    }

    public static void main(String[] args) {
        String s = "AAAAAAAAAABBBACDDEAEBBB";
        maxOccurrence(s);
    }
}
