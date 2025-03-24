package collections.practice.strings;

public class LongestCommonSubString {
    public static String longestSubString(String s1,String s2)
    {
        String str = "";

        for(int i=0; i<Math.min(s1.length(),s2.length()); i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                str += s1.charAt(i);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String s1 = "AABCDGH";
        String s2 = "AABCDGHR";

        String s = longestSubString(s1,s2);
        System.out.println("Longest Common Sub-string is : " + s);
    }
}
