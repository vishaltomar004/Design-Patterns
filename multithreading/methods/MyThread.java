package methods;

public class MyThread extends Thread {

    @Override
    public void run() {

        // Code for interrupt method
        // try {

        // Thread.sleep(1000);
        // System.out.println("Running , this will not print after interruption method
        // beingcalld");
        // } catch (InterruptedException e) {
        // System.out.println("Thread interrupted : " + e);
        // }

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running ");
            Thread.yield();  // Hint de rahe hai ki dusre threads ko bhi chance do 
        }

    }

    public static void main(String[] args) throws InterruptedException {

    //     MyThread l = new MyThread();
    //     l.start();
    //     l.interrupt() ;  // means what ever l  is doing stop it

    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();

t1.start();
t2.start();


    }
}

// start , run , sleep , join , set priority , yeild