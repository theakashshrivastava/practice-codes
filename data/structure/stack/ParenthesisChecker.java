package data.structure.stack;

import java.util.Stack;

public class ParenthesisChecker {
    public static boolean isPar(String s) {
        Stack<Character> st = new Stack<>();
        char x = ' ';
        for(int i=0; i<s.length(); i++)
        {
            x = s.charAt(i);
            if(x == '{' || x == '[' || x == '(' ) st.push(x);

            else if(!st.empty() && ((x == '}' && st.peek() == '{') ||
                    (x == ']' && st.peek() == '[') || (x == ')' && st.peek() == '(')))
            {
                st.pop();
            }

            else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "{()}[]";
        if (isPar(s))
            System.out.println("true");
        else
            System.out.println("false");
    }
}