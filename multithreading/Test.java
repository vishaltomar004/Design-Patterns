public class Test {

    public static void main(String []args){
        System.out.println("Chal gyaa");

        World t1 = new World();  // new state of thread. NEW

        t1.start();  // RUNNABLE
      
      for( ; ;){
        System.out.println(Thread.currentThread().getName());
      }
    }
}