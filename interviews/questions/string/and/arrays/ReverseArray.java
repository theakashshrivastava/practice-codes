package interviews.questions.string.and.arrays;

public class ReverseArray {
    public static void reverseFun(int[] a)
    {
        int left = 0;
        int right = a.length-1;
        int temp;

        while(left<right)
        {
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        for(int x: a)
        {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {17,3,13,4,95};
        reverseFun(a);
    }
}
