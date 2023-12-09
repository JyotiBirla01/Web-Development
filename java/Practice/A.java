

interface A {
    void m1();

    default void m2(){
System.out.println("Hello");
    }

}
class Main {
    public static void main(String[] args) {
        A oj= ()->System.out.println("m1");
        oj.m1();
        oj.m2();

    }
}