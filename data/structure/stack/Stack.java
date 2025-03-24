package data.structure.stack;

public class Stack<Character> {
    int[] arr = new int[100];
    int top = -1;

    //operations on Stack
    public void push(int x){
        top++;
        arr[top]  = x;
    }

    public int pop(){
        int x = arr[top];
        top--;
        return x;
    }

    public int size(){
        return top+1;
    }

    public int top(){
        return arr[top];
    }

    public boolean isEmptyStack() {
        if(top == -1){
            return true;
        }
        return false;
    }
}
