class A {
    static {
        System.out.println("Static block ");
    }

    public void m0() {
        System.out.println("m0 called ");
    }

    class B {
        {
            System.out.println("INitializer block");
        }
        static {
            System.out.println("static B block ");
        }

        public void m1() {
            System.out.println("m1 called ");
        }

        public void m2() {
            System.out.println("m2 called ");
        }
    }
}

class C extends A {

}

class Main {
    public static void main(String[] args) {
        // A obj = new A();
        // A.B obj1 = obj.new B();
        // obj.m0();
        // obj1.m1();
        // obj1.m2();
        C child = new C();
        C.B child1 = child.new B();
        child1.m1();
        child1.m2();

    }
}