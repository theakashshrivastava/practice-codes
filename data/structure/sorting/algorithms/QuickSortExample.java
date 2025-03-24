package data.structure.sorting.algorithms;

public class QuickSortExample {
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,9,4,7,6,1};
        quickSort(arr,0,arr.length-1);
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low>=high) return;
        int pivot = partition(arr, low,high);
        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int i = start-1;
        int temp = 0;
        for(int j=start; j<=end-1; j++)
        {
            if(arr[j]<arr[pivot])
            {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, end);
        return i;
    }
}
