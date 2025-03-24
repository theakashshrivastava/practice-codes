package interviews.questions.string.and.arrays;

import java.util.Arrays;

public class CompareTwoArray {
    public static void compareArray(int[] a, int[] b)
    {
        //Approach 1
        int misMatch = Arrays.mismatch(a,b);
        System.out.println("Is there a mismatch between 2 Arrays : " + misMatch);

        //Approach 2
        if(a.length==b.length)
        {
            for(int i=0; i<a.length; i++)
            {
                if(a[i]!=b[i])
                    System.out.println("Arrays differ at Index : " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};
        compareArray(a,b);

    }
}
