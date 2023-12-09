
public class VarArg {
    // public void m1(int... x) {
    // System.out.println("zero");
    // System.out.println("one");
    // System.out.println("two");
    // System.out.println("three");
    // }

    // public void m1(double... x) {
    // for (int i = 0; i < x.length; i++) {
    // System.out.println(x[i]);
    // }
    // }
    public void m1(int x, int y, int... z) {
        System.out.println("x is " + x);
        System.out.println(" y: " + y);
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
    }

    public static void main(String[] args) {
        VarArg obj = new VarArg();
        // obj.m1();
        // obj.m1(2);
        // obj.m1(2, 3);
        obj.m1(2, 3, 4, 5, 5, 6, 7, 8);
        // obj.m1(2.2, 3.3, 4.5, 6.6);
    }
}
