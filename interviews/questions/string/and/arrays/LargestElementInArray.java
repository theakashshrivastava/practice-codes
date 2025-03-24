package interviews.questions.string.and.arrays;

public class LargestElementInArray {
    public static int findLargest(int[] a)
    {
        int temp = 0; //Assume this is Largest in Array
        for(int i=0; i<a.length; i++)
        {
            for(int j= i+1; j<a.length; j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[a.length-1];
    }

    public static void main(String[] args) {
        int[] a = {12, 45, 7, 89, 34};
        int temp = findLargest(a);
        System.out.println(temp);
    }
}
