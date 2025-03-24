package interviews.questions.string.and.arrays;

import java.util.StringTokenizer;

public class CountWordsInString {
    public static void countStringWords(String s)
    {
        StringTokenizer st = new StringTokenizer(s," ");
        System.out.println("Total words in String : " + st.countTokens());
    }

    public static void main(String[] args) {
        String s = "Java is great and Java is fun";
        countStringWords(s);
    }
}
