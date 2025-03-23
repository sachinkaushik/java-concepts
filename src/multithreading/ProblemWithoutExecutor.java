package multithreading;

public class ProblemWithoutExecutor {

    /*
        Here Threads we are creating and task/work also we are doing
        Thats why Executor Framework comes into picture to create/manage the threads
        we just have to take care work, not thread creation

        And we are just creating the threads, but not reusing same..
     */
    public static void main(String[] args) {
        long startTIme = System.currentTimeMillis();
        Thread[] threads = new Thread[10]; //we have to create thread pool like this
                                            // and there is no re-usability
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            threads[i] = new Thread(() -> System.out.println(factorial(finalI)));
            threads[i].start();
        }
        for(Thread t : threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total time : "+(System.currentTimeMillis() - startTIme));
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
