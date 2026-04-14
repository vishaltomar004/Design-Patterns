public class Test {

    public static void main(String []args){
        System.out.println("Chal gyaa");

        World world = new World();
        world.start();
      
      for( ; ;){
        System.out.println(Thread.currentThread().getName());
      }
    }
}