public class Test {

    public static void main(String []args){
        System.out.println("Chal gyaa");

        World world = new World();
        Thread t1 = new Thread(world);
        t1.start();
      
      for( ; ;){
        System.out.println(Thread.currentThread().getName());
      }
    }
}