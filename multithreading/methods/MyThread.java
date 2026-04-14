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

        // -------------- for yield -----------
        // for (int i = 0; i < 5; i++) {
        // System.out.println(Thread.currentThread().getName() + " is running ");
        // Thread.yield(); // Hint de rahe hai ki dusre threads ko bhi chance do
        // }

        // ----------------- for Daemon ----------------  works in backend , JVM  does not waits for them 
//         //Daemon thread is cool thinng , 
// Suppore we marked a thread as Daemon thread then if all thread are terminated then it will also terminate , like it it is used in an infinite loop then will will not run foreever  ,it will see ohh other threads are terminated now I am also will be stopped
        while (true) {
            System.out.println("Hellow world");
        }

    }

    public static void main(String[] args) throws InterruptedException {

        // MyThread l = new MyThread();
        // l.start();
        // l.interrupt() ; // means what ever l is doing stop it

        // MyThread t1 = new MyThread();
        // MyThread t2 = new MyThread();

        // t1.start();
        // t2.start();

 MyThread t1 = new MyThread();
t1.setDaemon(true);
 t1.start();

    }
}

// start , run , sleep , join , set priority , yeild , setDaemon