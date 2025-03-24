package collections.practice.strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static boolean isIsomorphic(String s1, String s2)
    {
        if(s1.length()==s2.length())
        {
            Map<Character,Character> isoMap = new HashMap<>();
            char c = '\0';
            for(int i=0; i<s1.length(); i++)
            {
                if(isoMap.containsKey(s1.charAt(i)))
                {
                    c = isoMap.get(s1.charAt(i));
                    if(c!= s2.charAt(i))
                        return false;
                } else {
                    isoMap.put(s1.charAt(i),s2.charAt(i));
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        boolean result = isIsomorphic(s1,s2);
        System.out.println(result);
    }
}
