class A {
    class B {
        public void m1() {
            System.out.println("m1 called ");
        }
    }
}

class Main {
    public static void main(String[] args) {
        A outer = new A();
        A.B inner = outer.new B();
        inner.m1();
    }
}