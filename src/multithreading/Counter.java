package multithreading;

public class Counter {
    private int count = 0;

    /*
        this is being invoked by 2 or more threads and all are trying to increment the count value
        so we need to make such method synchronized, so that at a time only 1 thread can access it

        This is also called RACE CONDITION

        DISAdvantage of Synchronization :
            Faireness
            Blocking
            Intruptibility
            Read/Write
     */
    public synchronized void increment(){
        //count++;
        synchronized (this){ //we can also create synchronized block only for
            count++;         //required code, that making the impact

        }
    }
    public int getCount(){
        return count;
    }
}
