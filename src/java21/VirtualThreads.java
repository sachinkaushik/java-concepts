package java21;

import java.util.concurrent.Executors;

public class VirtualThreads {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Hello from a virtual thread!");
        };
        //1
        Thread.startVirtualThread(task);
        
        //2
        // Create a virtual thread
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello from a virtual thread!");
        });

        // Wait for the virtual thread to finish
        try {
            virtualThread.join();
        } catch (InterruptedException e) {
            System.err.println("Thread was interrupted: " + e.getMessage());
        }
        //3
        var execcutor  = Executors.newVirtualThreadPerTaskExecutor();
    }
}
