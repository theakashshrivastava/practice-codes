package interviews.questions.string.and.arrays;

import java.util.*;

public class DuplicateWordsInStr {
    public static void printDuplicateWords(String s)
    {
        Set<String> aSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            if(!Character.isAlphabetic(s.charAt(i)))
            {
                if(aSet.contains(String.valueOf(sb)))
                {
                    System.out.print(sb + " ");
                    sb.setLength(0);
                }
                else
                {
                    aSet.add(String.valueOf(sb));
                    sb.setLength(0);
                }

            }
            else
                sb.append(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s = "This is a test. This test is easy.";
        printDuplicateWords(s);
    }
}
