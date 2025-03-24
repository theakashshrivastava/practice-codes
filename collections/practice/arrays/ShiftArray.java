package collections.practice.arrays;

public class ShiftArray {
    public static void main(String[] args) {
        int[] a = {0,1,0,0,3,12,4};
        shiftArr(a);
        for(int x : a)
        {
            System.out.print(x + " ");
        }
    }

    private static void shiftArr(int[] a) {
        int head = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]!=0)
            {
                a[head] = a[i];
                a[i] = 0;
                head++;
            }
        }
    }
}
