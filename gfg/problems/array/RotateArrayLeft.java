package gfg.problems.array;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int d = 2;
        a = rotateArrayLeft(a, d);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
    public static int[] rotateArrayLeft(int[] arr, int d) {
        int n = arr.length;
        if (d == 0 || d == n) {
            return new int[0];
        } else if (d==d%n) {
            reverse(arr, 0, d - 1);

            reverse(arr, d, n - 1);
            reverse(arr, 0, n - 1);
            return arr;
        }
        return arr;
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}