package collections.practice.strings;

import java.util.*;

public class AnagramChecker {
    public static boolean isAnagram(String s1, String s2)
    {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        if(s1.length() != s2.length())
            return false;

        int[] charCount = new int[26];
        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            charCount[c - 'a']--;
        }
        return Arrays.stream(charCount).allMatch(count -> count == 0);
    }

    public static void main(String[] args) {
        String s1 = "RaceCarP";
        String s2 = "CarRacE";
        boolean result = isAnagram(s1,s2);
        System.out.println(result);
    }
}
