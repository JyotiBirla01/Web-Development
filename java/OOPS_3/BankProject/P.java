public class P {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
    }
}

interface A {
    default void m1() {
        System.out.println(" A ");
    } 

}

interface B {
    default void m1() {
        System.out.println("  B");
    }

}

class C implements A, B {
    public void m1() {
        A.super.m1();
        B.super.m1();
        System.out.println(" M1");

    }
}
