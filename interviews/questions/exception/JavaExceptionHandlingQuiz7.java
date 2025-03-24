package interviews.questions.exception;

public class JavaExceptionHandlingQuiz7 {
    class SuperClass
    {
        void anyMethod() throws NullPointerException
    {
        System.out.println("Super Class Method");
    }
    }
    class SubClass extends SuperClass
    {
        @Override
        void anyMethod() throws ArrayIndexOutOfBoundsException, NumberFormatException,
        ClassCastException
    {
        System.out.println("Sub Class Method");
    }
    }
}
