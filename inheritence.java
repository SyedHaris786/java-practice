class Computer {
    int a =1;
public Computer (int l){
    System.out.println("Hello super" + l );
}

    public void playMusic() {
       System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost){
        return "pen";
    }
    
    public int add (int a, int b){
        return a + b; 
    }

    public void overriding () {
        System.out.println("OverRide me please!! ");
    }


    public final void finale () {
        //THis is a constant method it could not be redefined in the inherited classes also
        System.out.print("I am Final!! ");
    }
}

class Computer2 extends Computer {
    
    public Computer2(){    
  
        // Super method should be passes in child class to inherit parent classes additional constructor
        // It is basically used to use the methods and variables of parent class 

        super(5);

        // System.out.println("null");
  
    }

    
    //Multiple args could be provided here, and it is called "variable length argument"
    public int add(int ... n){
        
        int sum =0; 
        
        for (int i:n){
            sum = sum +i;
        }
        
        return sum;
        
    }
    // Method overriding
    @Override
    public void overriding () {
        super.overriding();
        
        System.out.println("OverRideddd!!" + a);
        }

}

// final keyword with class is used to define a class which can not be extended or inherited

final class test {
    
    public void hell () {
        System.out.print("THis is final class ");
    }
}

/////=============================================== Main Class ===============================================//
public class inheritence {
    
    public static void main(String a[]){
    
    Computer2 calc = new Computer2();
        calc.overriding();

    System.out.println(calc.add(1,2));

    }



}
