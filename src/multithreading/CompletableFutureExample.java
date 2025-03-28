package multithreading;

import java.util.concurrent.CompletableFuture;

/*
    By Default, CompletableFuture tasks often run on daemon threads due to the use of
    ForkJoinPool.common.Pool, you can control the thread by providing a custom executorservice
    The CompletableFuture task itself doesn't dictate whether its a daemon or user thread
 */
public class CompletableFutureExample {

    public static void main(String[] args) {
        CompletableFuture<String> worker = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Worker");
            } catch (Exception e) {

            }
            return "OK";
        });
       //worker.get();
        System.out.println("MAIN....");
    }
}
