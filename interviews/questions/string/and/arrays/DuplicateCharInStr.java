package interviews.questions.string.and.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInStr {
    public static void printRepeatingChars(String s)
    {
        char[] ch = s.replace(" ","").toLowerCase().toCharArray();
        Set<Character> mySet = new HashSet<>();
        for(char x : ch)
        {
            if(!mySet.contains(x))
                mySet.add(x);
            else
                System.out.println(x);
        }
    }
    public static void main(String[] args) {
        String s = "Madam";
        printRepeatingChars(s);
    }
}
