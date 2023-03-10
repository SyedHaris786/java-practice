public class trycatch {
    public static void main(String[] args) {
       
       try{
        int a[] = new int[5];
        a[6] = 12;
       }
       catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException \n" + e);
       }
       finally {
        System.out.println("Finally");
       }

    }
}
