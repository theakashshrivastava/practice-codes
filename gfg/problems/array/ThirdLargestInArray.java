package gfg.problems.array;

public class ThirdLargestInArray {
    public static void main(String[] args) {
        int[] arr = {10,4,3,50,23,90,91,92,93};
        if(arr.length<3)
        {
            System.out.println("Invalid Input");
            return;
        }
        int result = getThirdLargest(arr);
        System.out.println(result);
    }

    private static int getThirdLargest(int[] arr) {
        int f= arr[2];
        int s = arr[1];
        int t = arr[0];
        for(int x : arr)
        {
            if(x >f)
            {
                t=s;
                s=f;
                f=x;
            }
            else if(x>s)
            {
                t=s;
                s=x;
            }
            else
            {
                t=x;
            }
        }
        return t;
    }
}
