package interviews.questions.exception;

public class JavaExceptionHandlingQuiz3 {
    public static void main(String[] args) {
        try
        {
            throw new NullPointerException("My_Exception");
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }
}
