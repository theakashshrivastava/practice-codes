package interviews.questions.string.and.arrays;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "Akash";
        String s1 = "";
        for(int i=s.length()-1; i>=0; i--)
        {
            s1 += s.charAt(i);
        }
        System.out.println("Palindrome string " + s.equals(s1));
    }
}
