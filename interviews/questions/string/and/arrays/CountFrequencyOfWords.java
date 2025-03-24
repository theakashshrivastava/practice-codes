package interviews.questions.string.and.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfWords {
    public static void countFrequency(String s)
    {
        StringBuilder sb = new StringBuilder();
        Map<String,Integer> m1 = new LinkedHashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                sb.append(s.charAt(i));
            }
            else
            {
                if(!m1.containsKey(String.valueOf(sb)) && !sb.isEmpty())
                {
                    m1.put(String.valueOf(sb),1);
                    sb.setLength(0);
                }
                else if(!sb.isEmpty())
                {
                    m1.put(String.valueOf(sb),m1.get(String.valueOf(sb))+1);
                    sb.setLength(0);
                }
            }
        }
        for(Map.Entry<String, Integer> x : m1.entrySet())
        {
            System.out.println(x.getKey() + ":" + x.getValue());
        }
        System.out.println(m1.entrySet());
    }

    public static void main(String[] args) {
        String s = "This is a test. This test is easy.";
        countFrequency(s);
    }
}
