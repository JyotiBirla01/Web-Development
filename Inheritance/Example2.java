class A {
    public A() {
        // this(100);
        System.out.println("Default A");
    }

    public A(int x) {
        System.out.println("Parameterized A");
    }

}

class B extends A {
    public B() {
        //super(100);
      this(17);
        System.out.println("Default B");
    }

    public B(int x) {

        System.out.println("Parametrized B");
    }

    public static void main(String[] args) {
        // new B();
        // new A(20);

        new B();
    }
}