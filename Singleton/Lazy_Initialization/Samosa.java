package Singleton.Lazy_Initialization;

public class Samosa {

   private static Samosa samosa ;
    
    private Samosa(){
     
        if(samosa != null){
            throw new RuntimeException("You are breaking singleton");
        }
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