package Singleton.Breaking_singleton.Enum;

 enum Samosa {

    INSTANCE;
    
}

public class Demo{

    public static void main(String[] args) {
        Samosa s1 = Samosa.INSTANCE;
        Samosa s2 = Samosa.INSTANCE;
        System.out.println("New Enum object aa : "+ s1.hashCode());
          System.out.println("New Enum object aa : "+ s2.hashCode());
    }
}
