package interviews.questions.exception;

public class JavaExceptionHandlingQuiz2 {
    public static void main(String[] args) {
        System.out.println(anyMethod());
    }

    public static int anyMethod() {
        int i = 1;
        try {
            i = i + 1;
            return i;
        } catch (Exception e) {
            i = i + 2;
        } finally {
            i = i + 3;
        }
        System.out.println(i);
        return i;
        }
    }

