package Singleton.Breaking_singleton;

import Singleton.Lazy_Initialization.Samosa;

import java.lang.reflect.Constructor;

 class Reflection {

    /*
    1.Reflection API
            Solution 1 : if object is laready ther throw exception 
            Solution 2. Enum 
     */


public static void main(String[] args) throws Exception {
    
    Samosa s1 = Samosa.getObject();
    System.out.println(s1.hashCode());

     Samosa s2 = Samosa.getObject();
    System.out.println(s2.hashCode());

    Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor(null);
constructor.setAccessible(true);
    Samosa s3 =     constructor.newInstance();
System.out.println(s3.hashCode());

}
    
}
