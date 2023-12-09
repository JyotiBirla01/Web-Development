class Test {
    public Test() {
        // this(100);

    }

    public Test(int x) {
        this(20, 50);
        this(100);
    }

    public Test(int a, int b) {

    }
}

class Main {
    public static void main(String[] args) {
        new Test();
    }

}
