interface I1 {
    void m1();
}

interface I2 {
    void m2();

}

class C implements I1, I2 {
    public void m1() {
        System.out.println("m1 called");
        
    }

    public void m2() {
        System.out.println("m2 called ");
    }

}

class Main {
    public static void main(String[] args) {
        I1 obj = new C();
        I2 obj1 = new C();
    }
}