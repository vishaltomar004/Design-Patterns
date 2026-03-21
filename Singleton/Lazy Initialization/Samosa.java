package Singleton;

public class Samosa {

   private static Samosa samosa ;
    
    private Samosa(){
     
    }

    public static Samosa getObject(){

        if (samosa == null) {
            samosa = new Samosa();
        }

        return samosa;
    }
}

// Make constructor private
/*
Make method static
Make  static private reference variable

 */