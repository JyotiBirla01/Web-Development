
public class A {
    private A() {

    }

    void m1() {
        System.out.println("Private Constructor ");
    }

}

class Test {
    public static void main(String args[]) {
        A obj = new A();
    }
}
