
public class Cwm {
    Cwm(int i) {
        System.out.println(i);
    }

    void m1(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Cwm c = new Cwm(10);
        c.m1(1, 2);
    }

}
