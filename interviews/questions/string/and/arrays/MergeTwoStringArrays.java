package interviews.questions.string.and.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoStringArrays {
    public static void  mergeArrays(String[] s1, String[] s2)
    {
        String[] s3 = Stream.concat(Arrays.stream(s1),Arrays.stream(s2)).toArray(String[]::new);
        for(String x : s3)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        String[] s1 = {"Java", "is", "fun"};
        String[] s2 = {"and", "powerful"};
        mergeArrays(s1,s2);
    }
}
