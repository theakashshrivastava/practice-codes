package multi.threading.sync;

public class Counter {
    private int count = 0;

    public void increment() {
        /**Critical Section**/
        synchronized (this) {
            /**Synchronised prevent race condition by enforcing mutual exclusion**/
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
