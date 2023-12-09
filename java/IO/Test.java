final public class Test {
    private static int a;

    private Test(int a) {
        this.a = a;
        System.out.println("Constructor ");
    }

    public void m1() {
        System.out.println(" m1 called ");
    }
}

class Main {
    public static void main(String[] args) {
        Test obj = new Test(a);
        obj.m1();

    }
}
