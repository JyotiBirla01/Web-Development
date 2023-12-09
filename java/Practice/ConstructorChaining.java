public class ConstructorChaining {
    private ConstructorChaining() {
        this(100);
        System.out.println("Default constructor called");
    }

    private ConstructorChaining(int x) {
        this(10, 20);
        System.out.println("Int x ,int y");
    }

    private ConstructorChaining(int x, int y) {
        System.out.println("Int x,int");

    }

    public static void main(String[] args) {
        new ConstructorChaining();
    }
}