package gfg.problems.array;

public class RelativePositionsInArray {
    public static void main(String[] args) {
        int [] arr = {0,1,0,0,3,12,4,-1};
        arr = shiftNonZeroElements(arr);
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }

    private static int[] shiftNonZeroElements(int[] arr) {
        int head = 0;
        for(int i = 0; i <arr.length; i++)
        {
            if(arr[i]!=0)
            {
                arr[head] = arr[i];
                head++;
                arr[i] = 0;
            }
        }
        return arr;
    }
}
