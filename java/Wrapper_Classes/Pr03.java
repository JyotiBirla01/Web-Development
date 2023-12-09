public class Pr03 {
    public static void main(String[] args) {
        // ------------primitive to object ----------------------
        // -------------- boxing --------------------------
        int a = 10;
        Integer i = new Integer(a);
        Integer j = new Integer(100);
        System.out.println(i + ", " + j);
        // -------------- Auto boxing ------------------------
        Integer k = 100;
        System.out.println(k);

        // ----------------object to primitive ----------------
        // ----------------unboxing ------------------------
        Integer obj = new Integer(10);
        int x = obj.intValue();
        System.out.println(x);
       // --------------- Auto Unboxing ---------------
       Integer obj1= new Integer(200);
       int y=obj1;
       System.out.println(y);
       
    }
}
