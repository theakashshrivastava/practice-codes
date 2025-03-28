package interviews.questions.exception;

public class JavaExceptionHandlingQuiz5 {
    public static void main(String[] args) throws Exception {
        try {
            try {
                try {
                    throw new Exception();
                } catch (Exception ex) {
                    throw ex;
                }
            } catch (Exception ex) {
                throw ex;
            }
        } catch (Exception ex) {
            throw ex;

            /**Add throws Exception in the method signature to avoid error**/

        }
    }
}
