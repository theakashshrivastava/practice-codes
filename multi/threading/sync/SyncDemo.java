package multi.threading.sync;

public class SyncDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        SyncThread thread1 = new SyncThread(counter);
        SyncThread thread2 = new SyncThread(counter);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
    }
}
