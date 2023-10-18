class Test extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            // try {
            //     Thread.sleep(1000);
            // } catch (InterruptedException e) {
                
            //     e.printStackTrace();
            // }
            System.out.println(" Child thread ");
        }
    }
}

public class Pr04 {
public static void main(String[] args) {
   
  
    Test t= new Test();
    t.start();
     for (int i = 0; i < 5; i++) {
          System.out.println("Main Thread ");
    }
    //t.start();   Exception Illegal Thread Exception 

}
}
