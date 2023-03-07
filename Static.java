class Employees {

    int eid;
    int salary; 
    static String name = "fucking name";

    static {
        name = "Common name";
    }

    Employees(){
        eid = 111;
        salary = 123;
        
    }

   public void hello (){
    System.out.println (eid+ ":" + salary + ":" + name);

    }

}

public class Static {
    String name = "haek";
    
    public static void main (String[] args){

        Employees Ea = new Employees();

        Ea.eid =1;
        Ea.salary = 12345;
        // a.name = "aaaa";
        
        Ea.hello();


 Employees b = new Employees();

        b.eid =2;
        b.salary = 5678;
        // b.name = "bbbb";
        
        b.hello();


    }    
}

