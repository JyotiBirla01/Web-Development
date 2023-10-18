class Test extends Thread {
    public void run() {
        // Thread.currentThread().setName("child Thread");
        System.out.println(Thread.currentThread().getName());
    }
}

public class Pr03 {
    public static void main(String[] args) {
        Test t = new Test();
        Thread.currentThread().setName("Jyoti");
        Thread.currentThread().setPriority(10);
        //Thread.currentThread().setPriority(0);
        System.out.print(" Priority of main thread is ");
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
        t.setName("Child Thread ");
        System.out.println(t.getPriority());
        t.start();

    }
}
