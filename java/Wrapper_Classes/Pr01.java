

public class Pr01 {
    public static void main(String[] args) {
        //------------Primitive to object ----------------------------
        // int a = 10;
        // Integer i = new Integer(10);
        // float b = 10;
        // Float f = new Float(b);
        int p = 12;
        Integer i = Integer.valueOf(p);
        Integer i1 = Integer.valueOf(12);
        Integer i2 = 12;
        System.out.println(i + ", " + i1 + " , " + i2);

        //------------------Object to primitive ---------------------
       // Integer iobj= new Integer(100);
        Integer obj= 12;
        System.out.println(obj);
         


    }
}
