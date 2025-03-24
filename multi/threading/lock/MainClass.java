package multi.threading.lock;

public class MainClass {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Runnable r = () -> {
            try {
                account.withdraw(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t1 = new Thread(r,"Thread 1");
        Thread t2 = new Thread(r,"Thread 2");
        t1.start();
        t2.start();
    }
}
