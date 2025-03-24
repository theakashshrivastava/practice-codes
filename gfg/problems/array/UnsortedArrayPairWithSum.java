package gfg.problems.array;

import java.util.HashSet;
import java.util.Set;

public class UnsortedArrayPairWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8};
        int sum = 55;
        System.out.println(isPairWithSum(arr, sum));
    }

    private static boolean isPairWithSum(int[] arr, int sum) {
        Set<Integer> m1 = new HashSet<>();
        for(int x : arr)
        {
            int y = sum - x;
            if(m1.contains(y))
            {
                System.out.println("Pair with given sum "+sum+" is ("+x+", "+y+")");
                return true;
            }
            else {
                m1.add(x);
            }
        }
        return false;
    }
}
