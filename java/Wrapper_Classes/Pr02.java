

public class Pr02 {
    public static void main(String[] args) {
       //---------------------- Primitive to object ------------------------------
    //    int i=100;
    //    Integer j= Integer.valueOf(i);   //Boxing 
    //    Integer p= i;       //Auto Boxing 
    //    System.out.println(i+" ,"+ j+", "+p);

       //-------------------------object to primitive -------------------
       Integer iobj= new Integer(100);
       Integer iobj1= 10;
       int i=iobj1.intValue();// unboxing 
       int j= iobj1;//Auto unboxing 
       System.out.println(i);
       

    }
    
}
