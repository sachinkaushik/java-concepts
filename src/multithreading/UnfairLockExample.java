package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLockExample {

    /*This lock provide unfairness, let say if we have three threads, any thread randomly can get
    the lock first
    if we want to define fairness, we can pass true in constructor of
    new ReentrantLock(true);

    after putting ture, all threads will get chance.... order depends on OS Scheduler
     */
    //private final Lock lock = new ReentrantLock();
    private final Lock lock = new ReentrantLock(true);

    public void doWork(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + " released the lock");
            lock.unlock();
        }

    }
}
