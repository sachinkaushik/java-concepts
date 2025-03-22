package multithreading;

public class ThreadMethodsDemo extends  Thread{

    @Override
    public void start() {
        System.out.println("Running thread...");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield(); // A hint to the scheduler that give chance to other thread as well

        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethodsDemo t = new ThreadMethodsDemo(); //user thread

        t.start();
        t.join(); // Main thread will wait for t thread completion
        t.setPriority(Thread.MIN_PRIORITY);
        t.interrupt(); // will intrrupt the thread
        t.setDaemon(true); //
        System.out.println("Done");
    }
}
