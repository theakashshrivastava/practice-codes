package gfg.problems.array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxProductOfTriplet {
    public static void main(String[] args) {
        int []arr = {-10, -3, -5, -6, -20};
        int max = maxProduct(arr);
        if (max == -1)
            System.out.print("No Triplet Exists");
        else
            System.out.print("Maximum product is " + max);
    }

    private static int maxProduct(int[] arr) {
        //Min heap
        PriorityQueue<Integer> pqMin = new PriorityQueue<>();
        //Max heap
        PriorityQueue<Integer> pqMax = new PriorityQueue<>(Comparator.reverseOrder());
        for(int x : arr)
        {
            pqMin.add(x);
            pqMax.add(x);
        }

        int maximum = pqMax.poll();
        int product1 = maximum * pqMax.poll() * pqMax.poll();
        int product2 = maximum * pqMin.poll() * pqMin.poll();

        return Math.max(product1, product2);
    }
}
