class Computer {
  
    public void playMusic() {
       System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost){
        return "pen";
    }
    
}

class args {
   
    //Multiple args could be provided here, and it is called "variable length argument"
    public int add(int ... n){
        
        int sum =0; 
        
        for (int i:n){
            sum = sum +i;
        }
    
        return sum;
    
    }
}

public class Hello {

    public static void main(String a[]){
    
    
    
    // Computer obj = new Computer();
    // obj.playMusic();
    // String str = obj.getMeAPen(10);
    // System.out.println(str);
   

    // int mutliArr[][] = new int [3][4];

    // for (int i=0; i<3; i++){ 
        
    //     for (int j=0; j<4; j++){
    //     System.out.println(mutliArr[i][j]);

    //     }
    
    // }



 //Args usage in java AKA variable length argument
    args l = new args();
    System.out.println(
        l.add(1,2,3,4,5,6,7,8,9,10)
    );
    }
}
