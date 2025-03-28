package interviews.questions.string.and.arrays;

public class StringWithDigitsOnly {
    public static void onlyDigitsInString(String s)
    {
        char[] ch = s.replace(" ","").toCharArray();
        for(Character x : ch)
        {
            if(!Character.isDigit(x))
                System.out.println("String contains Char other than digits!");
        }
    }

    public static void main(String[] args) {
        String s = "12A3456";
        onlyDigitsInString(s);
    }
}
