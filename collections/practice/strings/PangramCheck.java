package collections.practice.strings;

import java.util.*;

public class PangramCheck {
    public static void isPangram(String s)
    {
        Set<Character> s1 = new HashSet<>();
        for(int i=0; i<s.length(); i++)
        {
                s1.add(s.charAt(i));
        }
        System.out.print(s1+"\n");

        if(s1.size()!=26)
        {
            System.out.println("Not pangram");
        }
        else
            System.out.println("Pangram Strings");
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";

        String s1 = "The quick brown fox jumps over the dog";
        isPangram(s.replaceAll(" ","").toUpperCase());
        isPangram(s1.replaceAll(" ","").toUpperCase());
    }
}
