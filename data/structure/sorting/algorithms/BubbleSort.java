package data.structure.sorting.algorithms;

public class BubbleSort {
    public static void bubbleLogic(int[] a)
    {
        int temp = 0;
        int n = a.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int x: a)
            System.out.print(x + " ");
    }
    public static void main(String[] args) {
        int a[] = {13,24,46,52,20,9};
        bubbleLogic(a);
    }
}
