package collections.practice.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseWordsInString {
    public static void doReverse(String s)
    {
        char[] ch = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        List<String> tempList = new ArrayList<>();
        for(int i=0; i<ch.length; i++)
        {
            if(Character.isAlphabetic(ch[i]) || Character.isDigit(ch[i]))
            {
                sb.append(ch[i]);
            }
            else
            {
                tempList.add(String.valueOf(sb));
                sb.setLength(0);
            }
        }
        tempList.add(String.valueOf(sb));
        tempList.removeIf(String::isEmpty);
        int size = tempList.size();
        ListIterator<String> li = tempList.listIterator(size);
        while(li.hasPrevious())
        {
            if(size>1)
            {
                System.out.print(li.previous());
                System.out.print(".");
                size--;
            }
            else
                System.out.println(li.previous());
        }

    }

    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String s1 = "..geeks..for.geeks.";
        doReverse(s1);
        doReverse(s);
    }
}
