package java8.diamond.problem;

public interface InterfaceB {
    public void print();

    default void display()
    {
        System.out.println("Interface B display() method");
    }
}
