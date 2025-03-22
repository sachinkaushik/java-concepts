package multithreading;

/*
    In a multithreading environment, threads often need to
    communicate and coordinate with each other to accomplish the task
    without proper communication mechanism, threads might end up in
    inefficient busy-waiting states, leading to wastage of CPU resources and potential deadlocks

      Below methods are introduced for ITC,
      NOTE :: these methods are only be called within synchronized context
      wait(), notify(), notifyAll()

 */

class SharedResources{
    private int data;
    private boolean hasData;

    public synchronized void produce(int data){
        while (hasData){
            try {
                wait();
            }catch (Exception e){
                Thread.currentThread().interrupt();
            }
        }
        this.data = data;
        hasData = true;
        System.out.println(" Produced : "+data);
        notify();
    }
    public int consume(){
        while (!hasData){
            try {
                wait();
            }catch (Exception e){
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed :: "+data);
        notify();
        return data;
    }
}

class Producer implements Runnable{

    private SharedResources resources;
    public  Producer(SharedResources resources){
        this.resources = resources;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resources.produce(i);
        }
    }
}

class Consumer implements Runnable{
    private SharedResources resources;
    public Consumer(SharedResources resources){
        this.resources =resources;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int val = resources.consume();
        }
    }
}
public class InterThreadCommunication {

    public static void main(String[] args) {
        SharedResources resources = new SharedResources();
        Thread producer = new Thread(new Producer(resources));
        Thread consumer = new Thread(new Consumer(resources));
        producer.start();
        consumer.start();
    }
}
