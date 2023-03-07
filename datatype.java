public class datatype {
    public static void main(String[] args){
        
//========================Data types in Java============================================ 

    // int integer = 1; 
    // byte byt = 127; //max 127 could be stored
    // short short_integer = 23;
    // long long_integer = 1561561l ; //need to add l at the end
    
    // float fl = 23.3f; // need to add f at the end 
    // double big_int = 354684987; // more storage capacity

    // char c = 'c'; //used to stroe single character, dont know why 

    // boolean bool = false; 
    // int binary = 0b101; // binary format works 
    // System.out.println("\n" + binary);



//========== Type coercion and type casting in java =============

    // byte b = 127; 
    // int c = 258;
    // byte k = (byte) c; 


    // System.out.println(b);
    // System.out.println(c);
    // System.out.println(k);
    

// conditional statements 
// int x =10;
//     if (x >11 ) 
//     System.out.println("Helli");
//     else 
//     System.out.println("helllllllllloooooo");
   

// Arrays
//we need to define array with curly braces and empty array's data type must be defined 

        int arr [] = {};
        int nums[] = {1,2,3,4,5};

//Multi-dimensional array

        // int multi [][] = {};

        int mutliArr[][] = new int [3][4];

        mutliArr[1][2] = 1;
       
        int[][] myarray = new int[2][2];
        myarray[0][0] = 1;
        myarray[0][1] =  myarray[1][0] =  0;
        myarray[1][1] = 1;

        for (int i=0; i<3; i++){ 
            
            for (int j=0; j<4; j++){
            // System.out.print(mutliArr[i][j]);
            mutliArr[i][j] = (int)(Math.random()*10);


            }
        }

    for (int i=0; i<3; i++){ 
        for (int j=0; j<4; j++){
            System.out.print(mutliArr[i][j]);
            // mutliArr[i][j] = (int)(Math.random()*10);


            }
            System.out.println("");
        }


// Another way to write a for loop, Replacemant of For Each loop
    for (int n[] : mutliArr){
        for(int m: n){
            System.out.print(m + "");
        }
        System.out.println("");
    }



    

}
}