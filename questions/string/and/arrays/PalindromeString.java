package interviews.questions.string.and.arrays;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "Akash";
        StringBuilder s1 = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--)
        {
            s1.append(s.charAt(i));
        }
        System.out.println("Palindrome string " + s.contentEquals(s1));
    }
}
