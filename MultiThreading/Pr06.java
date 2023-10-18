/*Oveloading of run method  */
class Test extends Thread {
    public void run() {
        System.out.println(" No argument run method ");
    }

    // This method cannot be run because we cannot call it explicitly
    public void run(int i) {
        System.out.println(" argument run method ");
    }

}

public class Pr06 {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
       // t.start();
t.run(10);
    }
}
