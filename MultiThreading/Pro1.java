class A {
    B b;

    // public A(A a) {
    // this.a = a;

    // }

    synchronized public void m1(B a) {
        b.p1(this);
    }

    synchronized public void m2() {
        System.out.println(Thread.currentThread().getName());
    }
}

class B {
    A a;

    // public B(B b) {
    // this.b = b;
    // }

    synchronized public void p1(A a) {
        a.m1(this);
    }

    synchronized public void p2() {
        System.out.println(Thread.currentThread().getName());
    }
}

class Thread1 extends Thread {
    A a;
    B b;

    public void run() {
        b.p2();
    }
}

class Thread2 extends Thread {
    A a;
    B b;

    public void run() {
        a.m2();

    }
}

class Main {
    public static void main(String[] args) {
        // Thread1 obj1 = new Thread1();
        // Thread2 obj2 = new Thread2();
        A a = new A();
        B b = new B();
        a.getName();
        b.getName();
        a.start();
        b.start();
    }

}