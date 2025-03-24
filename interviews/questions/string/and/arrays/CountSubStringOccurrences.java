package interviews.questions.string.and.arrays;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubStringOccurrences {
    public static void countFrequency(String s)
    {
        String pattern = "Java";
        StringTokenizer st = new StringTokenizer(s);
        int count = 0;
        while (st.hasMoreTokens()) {
            if (st.nextToken().equals(pattern)) {
                count++;
            }
        }
        System.out.println("Total " + count);
    }

    public static void main(String[] args) {
        String s = "Java is great. Java is fun. Java is powerful.";
        countFrequency(s);
    }
}
