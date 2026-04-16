package locks;

public class BankAccount {
    private int balance = 100;
    
    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attem[pting to withdraw " + amount);

        if(balance >= amount){
             System.out.println(Thread.currentThread().getName() + " processing with withdral");

             try{
            Thread.sleep(5000);
             } catch(InterruptedException e){
                throw new RuntimeException(e);
             }

             balance -= amount;
              System.out.println(Thread.currentThread().getName() + " after withdrawl balance is : " + balance);
        }
        else {
             System.out.println(Thread.currentThread().getName() + " insufficient Balance");
        }
    }
}
