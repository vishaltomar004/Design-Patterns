package Singleton;

public class Example {
  
    public static void main(String[] args) {
        
      Samosa s1 =  Samosa.getObject();
       System.out.println(s1.hashCode());
      Samosa s2 = Samosa.getObject();
      System.out.println(s2.hashCode());
     
    }
}
