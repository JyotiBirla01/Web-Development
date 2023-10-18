class Test extends Thread {
    public void run() {
        for (int i = 0; i <5; i++) {
            try {
                Thread.sleep(2000, 3000);
            } catch (InterruptedException e) {
                // TO DO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(" Child thread  "); 
        }
       
    }
}

public class Pr05 {
    public static void main(String[] args) {
        Test t =new Test();
        t.start();
         for (int i = 0; i <5; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(" Main thread  "); 
        }
       
    }

}
