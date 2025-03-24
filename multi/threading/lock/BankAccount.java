package multi.threading.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+ " withdrawing " + amount + " from account with balance " + balance);
        try {
            lock.lock();
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS))
            {
                if(balance >= amount)
                {
                    try{
                            balance -= amount;
                            System.out.println(Thread.currentThread().getName() + " withdrawal successful");
                    }
                    catch (Exception e)
                    {
                        Thread.currentThread().interrupt();
                    }
                    finally {
                        lock.unlock();
                    }
                }
                else
                {
                    System.out.println(Thread.currentThread().getName() + "withdrawal failed due to insufficient balance");
                }
            }
            else {
                System.out.println(Thread.currentThread().getName() + "unable to acquire lock");
            }
        }
        catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
