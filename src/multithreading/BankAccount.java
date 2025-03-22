package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

   private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw "+amount);
        try{
            //lock.lock()
            //if(lock.tryLock()){
            if(lock.tryLock(1000, TimeUnit.MICROSECONDS)){
                if(balance > amount){
                    try {
                        System.out.println(Thread.currentThread().getName() + " processing with withdraw "+amount);
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Completed withdrawal balance : "+balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); //this a standard way to
                    }finally {
                        lock.unlock();
                    }

                }else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance "+amount);
                }
            }else{
                System.out.println(Thread.currentThread().getName() + "couldn't acquire the lock............");
            }
        }catch (Exception e){
            Thread.currentThread().interrupt(); //This is good practice
        }

    }
}
