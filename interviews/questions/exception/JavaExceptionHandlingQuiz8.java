package interviews.questions.exception;

import com.sun.jdi.ClassNotLoadedException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaExceptionHandlingQuiz8 {
    class SuperClass
    {
        void anyMethod() throws IOException
    {
        System.out.println("Super Class Method");
    }
    }
    class SubClass extends SuperClass
    {
        @Override
        void anyMethod() throws FileNotFoundException
                /**Exception is not compatible with throws clause in SuperClass.anyMethod()**/
    {
        System.out.println("Sub CLass Method");
    }
    }
}
