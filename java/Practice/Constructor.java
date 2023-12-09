public class Constructor {
    Constructor(int x) {
        System.out.println(x);

    }

    public Constructor(int x, int y) {

    }

    public Constructor(float x, float y, float z) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

class Main {
    public static void main(String[] args) {
        new Constructor(10);
        new Constructor(2, 5);
        new Constructor(2, 4.5f, 3.4f);

    }
}
