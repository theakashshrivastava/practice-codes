package interviews.questions.exception;

public class ChainException {
        public static void main(String[] args) {
            try {
                method1();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void method1() throws Exception {
            try {
                method2();
            } catch (Exception e) {
                System.out.println("1");
                throw new Exception("Exception in method1", e);
            }
        }

        public static void method2() throws Exception {
            System.out.println("2");
            throw new Exception("Exception in method2");
        }
    }
