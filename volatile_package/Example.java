package volatile_package;
class SharedObj{
    private volatile boolean flag = false;

    public void setFlagTrue(){
        flag = true;
        System.out.println("Void setFlagTrue is called");
    }

    public void printIfFlagTrue(){
        while(!flag){
            // do nothing
        }
        System.out.println("Flag is true !");
    }
}

public class Example {
    
    public static void main(String[] args) {
        
        SharedObj sharedObj = new SharedObj();

        Thread WriterThread  = new Thread(() ->{
           try{
                    Thread.sleep(1000);
           } catch(InterruptedException e){
                Thread.currentThread().interrupt();
           }
            sharedObj.setFlagTrue();
        });

        Thread readerThread = new Thread(() -> sharedObj.printIfFlagTrue());
        
        WriterThread.start();
        readerThread.start();
    }
}
