interface I {
    void wish();
}

class TestMain {
    public static void main(String[] args) {
        I obj1 = () -> System.out.println("Gm");
        I obj2 = () -> System.out.println("Gn");
        obj1.wish();
        obj2.wish();
    }
}