package interviews.questions.exception;

import java.io.IOException;

public class JavaExceptionHandlingQuiz6 {
    class SuperClass
    {
        void anyMethod()
        {
            System.out.println("Super Class Method");
        }
    }
    class SubClass extends SuperClass
    {
        @Override
        void anyMethod()
                /**
                 * In Java, when a subclass overrides a method, the overriding method must comply with the following rules for exceptions:
                 * The overriding method cannot throw broader (more general) exceptions than those declared by the overridden method in the superclass.
                 * If the method in the superclass does not declare any checked exceptions, the overriding method in the subclass cannot declare any checked exceptions.
                 * Removing IOException from line#16 or adding it in line#8 will fix the issue
                 * This is CHECKED EXCEPTION; if it was some Unchecked EXCEPTION there won't be any problem**/
    {

        System.out.println("Sub Class Method");
    }
    }
}
