package interviews.questions.exception;

public class JavaExceptionHandlingQuiz1 {
    public static void main(String[] args)
    {
        System.out.println(anyMethod());
    }
        public static int anyMethod()
        {
            int i = 1;
            try
            {
                i = i / 0;
                return i;
            }
            catch (Exception e)
            {
                i = i + 1;
                return i;
            }
finally
            {
                i = i + 2;
                System.out.println(i);
            }
        }
    }
