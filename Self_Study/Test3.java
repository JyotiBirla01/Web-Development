class Test3 {
    public Test3() {
        this(100);
    }

    public Test3(int x) {
        this();
    }
}

class TestMain {
    public static void main(String args[]) {
        new Test3();
    }
}
