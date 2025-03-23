package multithreading;


import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(9);
        long startTIme = System.currentTimeMillis();
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> System.out.println(factorial(finalI)));
        }
        executor.shutdown();
        //executor.shutdownNow(); shutdown the executor immediately
        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total time : "+(System.currentTimeMillis() - startTIme));

        //if want to return anything then use callable, else Runnable
        // also callable throws exception , while Runnable doesn't throw the exception
        Callable<String> call = () -> "Hello";
        Runnable run = () -> System.out.println("Hello");
        Future<String> submit = executor.submit(() -> System.out.println("Print me"), "Success");
        //executor.invokeAll(List.of(Callable/Runnable)); collection of task we can provide here

    }

    public static long factorial(int n){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
