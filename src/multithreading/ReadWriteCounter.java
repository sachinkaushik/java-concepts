package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {
    private int count = 0;
    /*
    ReadWriteLock allows multiple threads to read resources concurrently, as long as no
    other thread is writing to it.
    it ensures Exclusive access lock for write operation
     */
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock readLock = lock.readLock();
    private Lock writeLock = lock.writeLock();

    public void increment(){
        writeLock.lock();
        try{
            count++;
        }finally {
            writeLock.unlock();
        }
    }

    /*
        Here multiple threads can acquire the lock, only if no other thread
        has acquired the write lock
     */
    public int getCount(){
        readLock.lock();
        try{
            return count;
        }finally {
            readLock.unlock();
        }
    }
}
