package Singleton.Eager;

public class Example {
    public static void main(String[] args) {
        
        Jalebi j1 = Jalebi.getJalebi();
        System.out.println(j1.hashCode());
    }
}
