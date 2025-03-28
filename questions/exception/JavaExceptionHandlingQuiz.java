package interviews.questions.exception;

public class JavaExceptionHandlingQuiz
        {
        static int anyMethod()
        {
        int i = 1;
        try
        {
        i = i + 1;
        return i;
        }
        catch (Exception e)
        {
        i = i + 2;
        }
        finally
        {
        System.out.println("value of i here " + i);
        i = i + 3;
        }
        return i;
        }
public static void main(String[] args)
        {
        System.out.println(anyMethod());
        }
        }