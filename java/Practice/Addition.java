public class Addition {
    private int a, b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("a+b : " + (a + b));
    }

    public static void main(String[] args) {
        new Addition(10, 20);
    }
}
