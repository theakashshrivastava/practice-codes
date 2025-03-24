class A
{
    public void abc()
    {
        System.out.println("abc from A");
    }
    public void def()
    {
        abc();
    }
    private void m1(){
        System.out.println("m1 from A");
    }
}

class B extends A
{
    public void abc()
    {
        System.out.println("abc from B");
    }
    private void m1(){
        System.out.println("m1 from B");
    }
}

public class DemoPro {
    public static void main(String[] args) {
        B obj = new B();
        obj.def();
    }
}
