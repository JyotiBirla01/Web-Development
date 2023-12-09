
public class MethodOverloading {
    public void m1(byte x) {
        System.out.println(" byte bersion");
    }

    // public void m1(float x) {
    // System.out.println("Float version");
    // }

    public void m1(int x) {
        System.out.println("int version");
    }

    public void m1(long x) {
        System.out.println("L version");
    }

    public void m1(short x) {
        System.out.println("s version");
    }

    public void m1(int x, long y) {
        System.out.println("IL version");
    }

    public void m1(long x, int y) {
        System.out.println("LI version");
    }

    public void m1(int x, int y) {
        System.out.println("II version");
    }

    public void m1(char x) {
        System.out.println("char  version");
    }

    public static void main(String[] args) {
        char ch = 97;
        byte a = 1;

        MethodOverloading obj = new MethodOverloading();
        // obj.m1((byte) 10);
      //  obj.m1((byte) 2);
        // obj.m1(10, 20l);
        // obj.m1(97);
        obj.m1(a);

    }

}
