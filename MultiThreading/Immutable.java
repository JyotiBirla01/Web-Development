class A {
    private int a;

    A() {

    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}

final class B extends A {
    private final int b;

    B(int b) {
        super();
        this.b = b;
    }

    public void setA(int a) {

    }
}

class Main {
    public static void main(String[] args) {
        A obj = new B(20);
        obj.setA(10);
        // int result= obj.getA();
        // System.out.println(result);

    }

}