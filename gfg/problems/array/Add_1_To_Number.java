package gfg.problems.array;

public class Add_1_To_Number {
    public static void main(String[] args) {
        int a[] = {9,8,9,9};
        a = addOne(a);
        for(int x : a)
        {
            System.out.print(x + " ");
        }
    }
    private static int[] addOne(int[] a) {
        StringBuilder sb = new StringBuilder();
        for(int x : a)
        {sb.append(x);}
        int x = Integer.parseInt(sb.toString());
        x = x+1;
        System.out.println(x);
        for(int i = 0; i < a.length; i++)
        {
            a[i] = x%10;
            x = x/10;
        }
        return a;
    }
}
