package multithreading;

/*
 Thread Lifecycle...
  NEW
  Runnable

 */

public class Task {

    public static void main(String[] args) throws InterruptedException {
        Work work = new Work(); //NEW
        System.out.println(work.getState());
        work.start(); // RUNNABLE
        System.out.println(work.getState());
        Thread.sleep(100);
        System.out.println(work.getState()); //TIMED_WAITING

        Thread t = new Thread(work);
        t.start();
    }
}

class Work extends Thread{
    @Override
    public void run() {
        System.out.println("Doing the work....");
    }
}

class MyTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Doing the MyTask....");
    }
}
