package multithreading;

public class ReadWirteCounterTest {
    public static void main(String[] args) throws InterruptedException {
        ReadWriteCounter counter = new ReadWriteCounter();
        Runnable readTask = () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " read : "+counter.getCount());
                }
            };

        Runnable writeTask = () -> {
                for (int i = 0; i < 10; i++) {
                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + "incremented");
                }
            };

        Thread writeThread = new Thread(writeTask);
        Thread readThread1 = new Thread(readTask);
        Thread readThread2 = new Thread(readTask);
        writeThread.start();
        readThread1.start();
        readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();
        System.out.println("Final count : "+counter.getCount());
    }
}
