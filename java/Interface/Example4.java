class C1 {
    void m1() {
        System.out.println("m1 called ");
    }
}

class C2 {
    void m1();
    // {
    // System.out.println("m2 called ");
    // }
}

class C3 extends C1,C2{

    void m1() {
        System.out.println("m3 called ");
    }
}

class Main {
    public static void main(String[] args) {

        C3 obj = new C3();
        obj.m1();
    }
}