package collections.practice.strings;

import java.util.List;
import java.util.stream.Collectors;

public class CountDigitsInString {
    public static void main(String args[])
    {
        String s = "G12 e1  e 34k s f o r G e e k 12 34 567 190";

        List<Character> chList = s.
                replaceAll(" ", "")
                .chars()
                .mapToObj(c -> (char)c)
                .toList();
        int count = 0;

        for(Character c : chList)
        {
            if(Character.isDigit(c)) //Check for every char if it's a digit
                count++;
        }
        System.out.println(count);
    }
}

