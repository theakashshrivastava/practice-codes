package gfg.problems.array;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {10,4,3,50,23,90,91,92,93};
        if(arr.length<2) {
            System.out.println("Invalid Input");
            return;
        }
        int y = secondLargest(arr);
        System.out.println(y);
    }

    private static int secondLargest(int[] arr) {
        int first = arr[1];
        int second = arr[0];
        for(int x : arr)
        {
            if(x>first) {
                second = first;
                first = x;
            }
            else if(x> second) {
                second = x;
            }
        }
        return second;
    }
}
