package interviews.questions.string.and.arrays;

public class CountVowelsConsonants {
    public static void countVowAndCons(String s)
    {
        char[] ch = s.replace(" ","").toCharArray();
        int vowel = 0;
        int consonant = 0;
        for(char x : ch)
        {
            if(Character.isAlphabetic(x))
            {
                if(x == 'a'||x == 'e'||x == 'i'||x == 'o'||x == 'u')
                {
                    vowel++;
                }
                else
                    consonant++;

            }
        }
        System.out.println("Vowel count " + vowel);
        System.out.println("Consonant count " + consonant);
    }

    public static void main(String[] args) {
        String s = "Hello world";
        countVowAndCons(s);
    }
}
