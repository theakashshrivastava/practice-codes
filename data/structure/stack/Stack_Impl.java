package data.structure.stack;

public class Stack_Impl {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s.size());
        s.pop();
        System.out.println("Removed one element " + s.size());
        s.push(60);
        System.out.println("Added one element " + s.size());
        System.out.println("Top element is " + s.top());
        System.out.println("Removed one element " + s.pop());
        System.out.println(s.isEmptyStack());
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.isEmptyStack());
    }
}
