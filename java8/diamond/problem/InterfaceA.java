package java8.diamond.problem;

public interface InterfaceA {
    public void print();

    default void display()
    {System.out.println("Interface A display() method");}
}
