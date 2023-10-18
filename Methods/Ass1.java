//) WAP to print a statement 1000 number of times.
public class Ass1 {
    public void number(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }
    }
}

class Main {
    public static void main(String[] args) {
        int n = 1000;
        Ass1 obj = new Ass1();
        obj.number(n);
    }
}
