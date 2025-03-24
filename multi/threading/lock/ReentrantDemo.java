package multi.threading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantDemo {
    private final Lock lock = new ReentrantLock();

    public void outerMethod()
    {
        lock.lock();
        try{
            System.out.println("Inside outer method");
            innerMethod();
        }
        finally {
            lock.unlock();
        }
    }

    private void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inside inner method");
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantDemo demo = new ReentrantDemo();
        demo.outerMethod();

    }
}
