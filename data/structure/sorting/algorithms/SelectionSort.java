package data.structure.sorting.algorithms;

public class SelectionSort {
    public static void sortLogic(int[] a)
    {
        int n = a.length;
        int temp = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int x: a)
            System.out.print(x + " ");
    }
    public static void main(String[] args) {
        int a[] = {13,24,46,52,20,9};
        sortLogic(a);
    }
}
