
class Calculator {

int a;
int b;

  public double add (double d, double c ){
  
    return d + c;
    }


  public int add (int a, int b){
      this.a = a;
      this.b =b; 
      return a+b; 
    }

}

public class oop {
    
    public static void main (String[] args){

        Calculator object = new Calculator();

        object.a= 3;
        object.b= 3;

        System.out.println(object.add(5.5,5.5));
        System.out.println(object.add(3,4));
        
    //    System.out.println(object);

    }



}
