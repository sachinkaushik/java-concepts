package multithreading;

/*
    Each thread keeps local copy of variable in its cache, for performance reason

 */
class SharedObject {
    //private boolean flag = false;
    private volatile boolean flag = false;
    public  void setFlagTrue(){
        System.out.println("writer Flag is true......");
        flag = true;
    }
    public void printIfFlagTrue(){
        while (!flag){

        }
        System.out.println("Flag is true");
    }
}
public class VolatileExample {

    public static void main(String[] args) {
        SharedObject obj = new SharedObject();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
            }
            obj.setFlagTrue();
        });
        Thread readerThread = new Thread(() -> obj.printIfFlagTrue());
        writerThread.start();
        readerThread.start();
    }
}
