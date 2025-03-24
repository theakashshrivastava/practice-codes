package interviews.questions.exception;

public class JavaExceptionHandlingQuiz4 {
    public static void main(String[] args) {
        try
        {
            try
            {
                NumberFormatException ex = new NumberFormatException();
                throw ex;
            }
            catch (NullPointerException ex)
            {
                System.out.println(1);
            }
        }
        catch (Exception ex)
        {
            System.out.println(2);
        }
catch (Throwable ex)
        {
            System.out.println(3);
        }
    }
}
