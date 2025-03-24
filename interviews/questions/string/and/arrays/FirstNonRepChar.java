package interviews.questions.string.and.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepChar {
    public static void printFirstNonRepChar(String s)
    {
        char[] ch = s.replace(" ","").toCharArray();
        Map<Character,Integer> m1 = new LinkedHashMap<>();
        for(char x : ch)
        {
            if(m1.containsKey(x))
                m1.put(x,m1.get(x)+1);
            else
                m1.put(x,1);
        }
        //print first non-repetitive char
        for(Map.Entry<Character,Integer> x : m1.entrySet())
        {
            if(x.getValue()==1)
                System.out.println("First non-rep char is\n" + x.getKey() + ":" + x.getValue());
            break;
        }
    }

    public static void main(String[] args) {
        String s = "Java articles are awesome";
        printFirstNonRepChar(s);
    }
}
