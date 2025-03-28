package interviews.questions.string.and.arrays;

public class LargestElementInArray {
    public static void findLargest(int[] a)
    {
        int temp = a[0];
        for(int i=0; i<a.length; i++)
        {
            for(int j= i+1; j<a.length-1; j++)
            {
                if(a[i]<a[j])
                {
                    temp = a[j];
                }
            }
        }
        System.out.println("Maximum value in the array is: "+temp);
    }

    public static void main(String[] args) {
        int[] a = {12, 45, 7, 89, 34};
        findLargest(a);
    }
}
