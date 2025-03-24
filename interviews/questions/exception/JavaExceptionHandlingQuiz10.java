package interviews.questions.exception;

public class JavaExceptionHandlingQuiz10 {
    public static void main(String[] args) throws Exception {
        JavaExceptionHandlingQuiz10 obj = new JavaExceptionHandlingQuiz10();
        obj.A();
        obj.display();
    }
    int count = 0;
    void A() throws Exception {
        try {
            count++;
            try {
                count++;
                try {
                    count++;
                    throw new Exception();
                }
                catch(Exception ex) {
                    count++;
                    throw new Exception();
                }
            }
            catch(Exception ex) {
                count++;
                throw new Exception();
            }
        }
        catch(Exception ex) {
            count++;
        }
    }
    void display() {
        System.out.println(count);
    }
}
