class Test extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(" Child thread ");
        }
    }
}


public class Pr01 {
public static void main(String[] args) {
    Test t =new Test();
    t.start();
    for (int i = 0; i < 5; i++) {
        System.out.println(" Main  thread ");
    }
}
}
