class Test {

    public Test() {
        System.out.println("-------Constructor------------ ");

    }

    public void m1() {
        System.out.println("--------Method -------");
    }

    static {
        System.out.println("--------Static block------- ");
    }

}

class Main {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.m1();

    }
}
