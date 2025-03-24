package java8.functional.interfac;

@FunctionalInterface
public interface MyInterFace {

    public void print();
    public static void display()
    {
        System.out.println("This is a static method");
    }
    public default void message()
    {
        System.out.println("This is a default method");
    }
}
