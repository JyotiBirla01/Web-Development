abstract class Test {
    private void m1() {
        System.out.println("Hello");
    }

    abstract public void m2();

}

class Test1 extends Test {
     private void m1() {
        System.out.println("m1");
    }
    public void m2() {
        System.out.println("m2 ");
    }   
}

class Main {
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.m2();
        obj.m1();

    }
}
