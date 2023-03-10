// Types of ineterface
// 1. Normal Interface
// 2. Single Abstract method
// 3. Marker interface


//Lambda expression

interface Abc {
    // public void show();
    default void def (){
        System.out.println("Default method ");
    }
}

class d implements Abc {
    public void show (){
        System.out.println("shaow");
    }     
}

public class interfaceTypes {
    public static void main(String[] args) {

        // This is a functional interface, It can only be acheived using interfaces with single method

        // Abc obj = ()-> System.out.println("null");
        // obj.show();


        d obj2 = new d();
        obj2.def();
        obj2.show();

    }

    
}
