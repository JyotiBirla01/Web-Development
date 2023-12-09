//Overriding  of start method 
class Test extends Thread {

    public void start() {
        super.start();
        System.out.println(" start ");

    }

    public void run() {
        System.out.println(" Child thread ");
    }
}

public class Pr08 {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        System.out.println(" main");
    }
}
