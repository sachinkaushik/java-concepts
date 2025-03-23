package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorDemo {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(() -> System.out.println("Task executed after 5 secs"), 5, TimeUnit.SECONDS);

        executorService.scheduleAtFixedRate(() -> System.out.println("Task executed after 5 secs"),
                5,
                5,
                TimeUnit.SECONDS);

        executorService.scheduleWithFixedDelay(() -> System.out.println("Task executed after 5 secs"),
                5,
                5, //for how much time , its has to wait for another task to start
                TimeUnit.SECONDS);


    }
}
