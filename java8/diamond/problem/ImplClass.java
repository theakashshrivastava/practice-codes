package java8.diamond.problem;

public class ImplClass implements InterfaceA, InterfaceB{
    public static void main(String[] args) {
        ImplClass obj = new ImplClass();
        obj.print();
        obj.display();

    }

    @Override
    public void print() {
        System.out.println("Print method");
    }

    @Override
    public void display() {
        InterfaceA.super.display();
        InterfaceB.super.display();
        System.out.println("Inside ImplClass");
    }
}
