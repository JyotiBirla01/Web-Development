interface I1 {
    void m1();

}

interface I2 {
    void m1();
}

class C implements I1, I2 {
    public void m1() {
        System.out.println("m1 called ");

    }

}

class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.m1();
    }
}