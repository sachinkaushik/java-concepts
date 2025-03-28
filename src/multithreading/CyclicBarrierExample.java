package multithreading;

import java.util.concurrent.*;

public class CyclicBarrierExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int noOfServices = 3;
        ExecutorService service = Executors.newFixedThreadPool(noOfServices);
        //we can use it when we have to wait for 1 or more threads completion
        CyclicBarrier barrier = new CyclicBarrier(noOfServices);
        Future<String> future1 = service.submit(new DependentTask(barrier));
        Future<String> future2 = service.submit(new DependentTask(barrier));
        Future<String> future3 = service.submit(new DependentTask(barrier));

        System.out.println("All Dependent service has been finished... now doing main task...");
        service.shutdown();
    }
}

class DependentTask implements Callable<String> {

    private CyclicBarrier barrier;
    public DependentTask(CyclicBarrier barrier){
        this.barrier = barrier;
    }
    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName()+" Dependent Service has started.......");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" is waiting for the barrier.......");
            barrier.await();
        }finally {

        }
        return "Started";
    }
}
