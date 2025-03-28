package interviews.questions.string.and.arrays;

import java.util.ArrayList;
import java.util.List;

public class FilterVowels {
    public static void main(String[] args) {
        String s= "hello, how are you";
        List<Character> mList = new ArrayList<>(s.length());

        Long count = 0L;
        for(int i=0; i<s.length(); i++)
        {
            mList.add(s.charAt(i));
        }
        count = mList.stream().filter(x-> x=='a'||x=='e'||x=='o'||x=='i'||x=='u').count();
        System.out.println("Total vowels : " + count);
    }
}
