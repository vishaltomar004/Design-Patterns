package locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();
    
    public  void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attem[pting to withdraw " + amount);
        try {
             if(lock.tryLock(1000 , TimeUnit.MILLISECONDS)){
                 if(balance >= amount){
                    try{
                    System.out.println(Thread.currentThread().getName() + " proceedint with withrawl of : " + amount);
                    Thread.sleep(3000);
                        balance -= amount;
                    } catch(Exception e){

                    } finally {
                        lock.unlock();
                    }
                 }
        } else {
System.out.println("Could not acquire the lock");
        }
        } catch (Exception e) {
            // TODO: handle exception
        }
       
       
    }
}
