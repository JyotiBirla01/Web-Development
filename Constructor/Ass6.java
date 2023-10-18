class Ass6 {
    Ass6(int a) {
        System.out.println(a);
    }

    Ass6(int b, int c) {
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        Ass6 obj1 = new Ass6(10);
        Ass6 obj2 = new Ass6(20, 30);

    }
}