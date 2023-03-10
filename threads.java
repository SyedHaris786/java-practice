
//Implemetation of threads in Classes 
class a extends Thread {

    public void run(){

    for (int i=0; i<=100000; i++){

        System.out.println("AAAAAAAAAAAA");
        try {Thread.sleep(10);} catch(Exception e){}
        
    }
}
}

class b extends Thread {

    public void run(){
        
        for(int j=0; j<=100000; j++){
            System.out.println("B");
            try {Thread.sleep(10);} catch(Exception e){}
            
        }
    }
}



/// Implementation of threads in Interfaces


class g implements Runnable {

    public void run(){

    for (int i=0; i<=100; i++){

        System.out.println("AAAAAAAAAAAA");
        try {Thread.sleep(10);} catch(Exception e){}
        
    }
}
}

class h implements Runnable {

    public void run(){
        
        for(int j=0; j<=100; j++){
            System.out.println("B");
            try {Thread.sleep(10);} catch(Exception e){}
            
        }
    }
}

// Threads syncronisation
class z {
    int count;
    //Here if the process needs to be run on different threads we should add syncronised keyword so that the process executes in syncronised way other wise one thread can change the execution state and we could get the different output than expected
    // other thing we noticed is when run using syncronised keyword it takes a bit more time to run and the processess in htop is completly visible but without sync keyword its running fast bbut not giving the expected output
    
        public synchronized void increament (){
        count++;
    }


}

public class threads {
    
    public static void main(String[] args) throws Exception
        {
   // Classes implementation of threads      
        // a obj1 = new a();
        // b obj2 = new b();
        
        // obj1.start();
        // // try{Thread.sleep(10);} catch (Exception e){}
        // obj2.start();
        


    // Interface implementation of Threads
        // g obj1 = new g();
        // h obj2 = new h();

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();


    // Direct Implementation of threads, using Thread class
    
    // Thread t5 = new Thread(()-> {
    //     for(int j=0; j<=10; j++){
    //         System.out.println("aaaaaaaa");
    //         try {Thread.sleep(10);} catch(Exception e){}
            
    //     }
    // });
    // Thread t6 = new Thread(()->{
    //     for(int j=0; j<=10; j++){
    //         System.out.println("B");
    //         try {Thread.sleep(10);} catch(Exception e){}
            
    //     }
    // });

    // t5.setPriority(Thread.MIN_PRIORITY);    
    // t6.setPriority(Thread.MAX_PRIORITY);

    // System.out.println(t5.getPriority());
    // System.out.println(t6.getPriority());

    // t5.start();
    // // try {Thread.sleep(10);} catch(Exception e){}
    // t6.start();

    // t5.join();
    // t5.join();

    

    // System.out.println("THis is between T1 and T2 ");


//===================== Threads Syncronisation =====================================//

    z objz = new z();
    
    Thread tz = new Thread (()-> {
      
            for (int i=0; i<10000000; i++){
                objz.increament();
            }
        
    });
    

    Thread tz1 = new Thread (()-> {
      
        for (int i=0; i<10000000; i++){
            objz.increament();
        }
    
    });



    tz.start();
    tz1.start();

    tz.join();
    tz1.join();

    System.out.println(objz.count);

    }

}
