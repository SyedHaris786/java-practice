
class a {
        
    public void shakalaka (){

        System.out.println("parint kilaas....");
    }

    public void boomboom () {
        System.out.println("Boom BOom!!");
    }   

}

class b extends a {

    public void shakalaka (){
        System.out.println("Child kilaas///");
    }

    public void boom (){
        System.out.println("null");
    }
}

class c extends a {

    public void shakalaka (){
        System.out.println("The C Class....!! ");
    }
    
    public void boomboom () {
        System.out.println("Boom BOom ccc!!");
    } 
}


public class DynamicMethodDispatch {

    public static void main (String[] args){


        a aaaa = new b(); //Runtime polymorphism

        aaaa.shakalaka(); 
        aaaa.boomboom();
        
        aaaa = new c();
        aaaa.shakalaka();// Dynamic Dspatch
        aaaa.boomboom();

    }    
}
