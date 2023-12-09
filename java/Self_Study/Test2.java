class Test2 {
    public void m1(byte x) {
        System.out.println("Byte version..");
    }

    // public void m1(int x) {
    // System.out.println("Integer version...");
    // }

    // public void m1(long x) {
    // System.out.println("Long Version....");
    // }

}

class TestMain {
    public static void main(String args[]) {
        Test2 obj = new Test2();
        obj.m1(10);// 1-parameter, int
    }
}