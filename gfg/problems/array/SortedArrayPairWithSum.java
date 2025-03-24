package gfg.problems.array;

import java.util.Arrays;

public class SortedArrayPairWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 10, 45, 8};
        int sum = 55;
        System.out.println(isPairWithSum(arr, sum));
    }

    private static boolean isPairWithSum(int[] arr, int sum) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==sum) return true;
            else if(arr[i]+arr[j]<sum) i++;
            else j--;
        }
        return false;
    }
}
