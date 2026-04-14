package methods;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    // @Override
    // public void run(){

    //     try {

    //         System.out.println("Thread is running aa");
        
    //     }catch (Exception e) {
    //         // TODO: handle exception
    //     }

// Set priority
    @Override
    public void run(){

        for(int i =0 ; i< 5; i++){
            for(int j =0 ; j<1000000000 ; j++){

            }
            System.out.println(Thread.currentThread().getName() + " - Priority : " + Thread.currentThread().getPriority() + " - count  " + i );

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }
    }
    public static void main(String[] args)  throws InterruptedException{



         MyThread l = new MyThread("Low Priority Thread");
         MyThread m = new MyThread("Medium Priority Thread");
         MyThread n = new MyThread("High Priority Thread");

         l.setPriority(Thread.MIN_PRIORITY);
         m.setPriority(Thread.NORM_PRIORITY);
         n.setPriority(Thread.MAX_PRIORITY);

         l.start();
         m.start();
         n.start();

        
    }
}


// start , run , sleep  , join , set priority