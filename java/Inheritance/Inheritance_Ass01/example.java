abstract class A {
    private int l;
    private int w;

    public A(int l, int w) {
        this.l = l;
        this.w = w;

    }

    public int getL() {
        return l;
    }

    public int getW() {
        return w;
    }

    abstract public int getArea();
}

class AChild extends A {

    public AChild(int l, int w) {
        super(l, w);

    }

    public int getArea() {
        return getL() * getW();
    }

    public static void main(String[] args) {
        A obj = new AChild(2, 3);
        obj.getArea();
        // new AChild(2, 3).getArea();
    }
}
