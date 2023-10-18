interface Sum {
    int a = 10;
    int b = 20;

    void m1(int a, int b);

}

class Main implements Sum {

    public void m1(int a, int b) {
        System.out.println(a + b);
    }

     public static void main(String[] args) {
        Main obj = new Main();
        obj.m1(a, b);

    }
}
