package methods;

public class MyThread extends Thread{

    @Override
    public void run(){

        try {

            System.out.println("Thread is running aa");
        
        }catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    public static void main(String[] args)  throws InterruptedException{

        MyThread t1 = new MyThread();
        t1.start();
        t1.join();   // main thread will wait for t1 to execute
        System.out.println("Hellow");
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
        
        
    }
}


// start , run , sleep  , join , set priority