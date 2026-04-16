 package synchronization;

public class Counter {

    private int count = 0;

    public void increment(){
        synchronized(this){         // both thread trying to get this like at an instance 101 for t1 and 101 for t2 too 
        count++;
        }
    }

    public int getCount(){
        return count;
    }
    
}