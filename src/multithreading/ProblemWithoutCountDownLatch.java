package multithreading;

import java.util.concurrent.*;

public class ProblemWithoutCountDownLatch {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<String> future1 = service.submit(new DependentService());
        Future<String> future2 = service.submit(new DependentService());
        Future<String> future3 = service.submit(new DependentService());
        /*
        here we are doing .get() for all services, and let say we have 10 or more services
        then this is not a goot practice to call get() method for each dependent service,
        SO this is the problem here
        and CountDownLatch comes to solve this problem
         */
        future1.get();
        future2.get();
        future3.get();

        /* Here main thread has to wait for some dependency to execute the rest of the code
            Let say I have to wait for all above dependent service to be completed
         before executing below code
         */

        System.out.println("All Dependent service has been finished... now doing majaor task...");
        service.shutdown();
    }
}

class DependentService implements Callable<String> {


    @Override
    public String call() throws Exception {
        System.out.println("Dependent Service has started.......");
        return "Started";
    }
}
