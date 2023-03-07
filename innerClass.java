
class Outer {
    
    public void hello (){
        System.out.println("Hello Outer");
    }
    
    static class inner2 {
        public void innerObject2(){
            System.out.println("inner222");
        }
    }


    class inner {
        
         public void  helloInner (){
                System.out.println("Hello Inner");
            }
            
        }
    }
    
public class innerClass {
    public static void main (String[] args){

        Outer out = new Outer();
        out.hello();
        
        // Use this method when the inner class is not static 
        Outer.inner inn = out.new inner();

        inn.helloInner();

        //Use this syntax when the inner class is static bich
        Outer.inner2 inn2 = new Outer.inner2();

        inn2.innerObject2();

    }


}
