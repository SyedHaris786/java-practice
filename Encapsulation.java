

class encap {

   private int a ; 
   private String b;

    public void setA(int a){

        this.a = a; 
    }

    public int getA(){
        return a; 
    }

    public void setB(String b){
        b = this.b;
    }

    public String getB(){
        return b; 
    }


}



public class Encapsulation {
    public static void main (String[] args){

    encap implementation = new encap();
    implementation.setA(1337);
    System.out.println( implementation.getA());


    }
}
