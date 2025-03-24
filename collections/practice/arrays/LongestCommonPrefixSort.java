package collections.practice.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestCommonPrefixSort {
    public static void main(String[] args) {
        String[] s = {"geeksforgeeks", "geeks", "geek", "geezer"};
        List<String> m1 = Arrays.asList(s);

        Collections.sort(m1);
        System.out.println(m1);
        String s1 = "";

        int minIndex = Math.min(m1.get(0).length(),m1.get(m1.size()-1).length());
        for(int i=0; i<minIndex; i++)
        {
            if(m1.get(0).charAt(i)==m1.get(m1.size()-1).charAt(i))
            {
                s1 += m1.get(0).charAt(i);
            }
            else
                break;
        }
        System.out.println("Longest prefix : " + s1);
    }
}

