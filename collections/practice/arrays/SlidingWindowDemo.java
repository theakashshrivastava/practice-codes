package collections.practice.arrays;

public class SlidingWindowDemo {
    public static void main(String[] args) {
        int a[] = {15,2,4,8,9,5,10,23};
        int k = 4;
        int target = 23;
        int sum = 0;
        int x = a.length-k+1;

        for(int i=0; i<x; i++)
        {
            for(int j=i; j<i+k; j++)
            {
                sum += a[j];
            }
            if(sum==target)
            {
                System.out.println("Target found between index "+i+" and "+(i+k-1));
                break;
            }
            sum = 0;
        }
    }
}
