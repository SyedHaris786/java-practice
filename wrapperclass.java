//This is the practice for Wrapper clas in java. In this technique we use primitive types as an object like we create the object of an integer value and use it like a reference type

// !!! This concept is deprected Now

public class wrapperclass {
    
    public static void main (String[] args){
        int a=5; 
        
        Integer num = new Integer(a);

    int j = num.intValue();

    System.out.println(j);
    }
}
