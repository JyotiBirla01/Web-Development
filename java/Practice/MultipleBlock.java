class A {
    static {
        System.out.println("a");
    }

}

class B {
    public static void main(String[] args) {
        System.out.println("Main");
        C obj = new C();
    }

    static {
        System.out.println("B");
    }
}

class C {
    static {
        System.out.println("c");
    }
}