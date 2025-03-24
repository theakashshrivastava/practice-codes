package interviews.questions.string.and.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {
    public static void printDuplicate(int[] a)
    {
        Set<Integer> tempS = new HashSet<>();
        for(int x : a)
        {
            if(!tempS.contains(x))
                tempS.add(x);
            else
                System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int[] a = {5, 5, 6, 7, 8, 8, 9};
        printDuplicate(a);
    }
}
