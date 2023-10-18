class FirstThread extends Thread {
    public void run() {
        System.out.println(" First thread ");
    }
}

class SecondThread extends Thread {
    public void run() {
        System.out.println(" Second  thread ");
    }
}

public class Pr02 {
    public static void main(String[] args) {
        FirstThread f = new FirstThread();
        SecondThread s = new SecondThread();
        System.out.println("Main thread ");
        f.start();
        s.start();
        System.out.println("Main at last ");

    }
}
