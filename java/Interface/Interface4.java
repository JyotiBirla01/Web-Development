interface I {
    // void m1();
    // void m2();
    static void m3() {
        System.out.println("Hello");
    }

    static void wish() {
        System.out.println("Gm");
    }

}

class TestMain {
    public static void main(String[] args) {
        I.wish();
        I.m3();
    }
}