public class Addition {
    private int a, b;

    public void setData(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public void add() {
        System.out.println(a + b);
    }

    public void sub() {
        System.out.println(a - b);
    }

    public void setA(int a) {
        this.a = a;

    }

    public void setB(int b) {
        this.b = b;

    }

    public int getA() {
        return a;

    }

    public int getB() {
        return b;

    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.setData(10, 20);
        System.out.println("The value of a is ");
        obj.add();
        System.out.println("The value of b is ");
        obj.sub();
        obj.setA(50);
        obj.setB(40);
        System.out.println("The value of A after upadating ");
        int result = obj.getA();
        System.out.println(result);
        System.out.println("The value of B after upadating ");
        int ans = obj.getB();
        System.out.println(ans);

    }

}
