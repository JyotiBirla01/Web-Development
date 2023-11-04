package Practice;

 class D1 extends Thread {
    public synchronized void m1(D2 d2) throws InterruptedException{
        Thread.sleep(3000);
        d2.m2(d2);
    }
}
class D2 extends Thread{
    public synchronized void m2(D1 d1) throws InterruptedException{
        Thread.sleep(3000);
       d1.m1(d1);
    }
}
class Main extends Thread{
    D1 d1= new D1();
D2 d2= new D2();
public static void main(String[] args) {
    Main m= new Main();
    m.
}
    

}