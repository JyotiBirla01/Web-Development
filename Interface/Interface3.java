interface I {
    void m1(int x);

    default void wish(int x) {
        System.out.println("Hello " + x);
    }
}

class TestMain {
    public static void main(String[] args) {
        I obj = (x) -> System.out.println("m1 called " + x);
        obj.wish(20);

        obj.m1(30);
    }

}