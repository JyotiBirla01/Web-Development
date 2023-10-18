interface I1 {
    int Operation(int x, int y);

}

class TestMain {
    public static void main(String[] args) {
        I1 obj1 = (a, b) -> a + b;
        I1 obj2 = (a, b) -> a - b;
        I1 obj3 = (a, b) -> a * b;
        I1 obj4 = (a, b) -> {
            if (a > b)
                return a;
            return b;
        };

        System.out.println(obj1.Operation(10, 20));
        System.out.println(obj2.Operation(10, 20));
        System.out.println(obj3.Operation(10, 20));
        System.out.println(obj4.Operation(10, 20));
    }
}