package multithreading;

import java.util.concurrent.*;
/*
    we can use it when we have to wait for 1 or more threads completion
    NOTE:  CountDownLatch is not re-usable
 */
public class CountDownLatchExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int noOfServices = 3;
        ExecutorService service = Executors.newFixedThreadPool(noOfServices);
        //we can use it when we have to wait for 1 or more threads completion
        CountDownLatch latch = new CountDownLatch(noOfServices);
        Future<String> future1 = service.submit(new DependentServices(latch));
        Future<String> future2 = service.submit(new DependentServices(latch));
        Future<String> future3 = service.submit(new DependentServices(latch));
        latch.await();
        latch.await(10, TimeUnit.SECONDS);
        System.out.println("All Dependent service has been finished... now doing main task...");
        service.shutdown();
    }
}

class DependentServices implements Callable<String> {

    private CountDownLatch latch;
    public DependentServices(CountDownLatch latch){
        this.latch = latch;
    }
    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName()+" Dependent Service has started.......");
            Thread.sleep(2000);
        }finally {
            latch.countDown(); //Good practice always put in finally block
        }
        return "Started";
    }
}
