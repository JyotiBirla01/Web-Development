

class A {
    public  synchronized void d1( B b){
        System.out.println("Thread 1 starts execution of d1");
        try{
Thread.sleep(6000);
        }
        catch(Exception e){
            e.printStackTrace();}
            System.out.println("Thread1 trying to call B last method");

b.last();
        
    }
    public synchronized void last(){
        System.out.println("Inside A");
    }
    
}
class  B{
    public synchronized void d2(A a){
         System.out.println("Thread 2 starts execution of d2");
        try{
Thread.sleep(6000);
        }
        catch(Exception e){
e.printStackTrace();
        }
        System.out.println("Thread 2 trying to call A last method");
a.last();
        
    }
    public synchronized void last(){
        System.out.println("Inside b");
    }
}
class Main extends Thread{
   
        A a =new A();
        B b = new B();
        public void m1(){
            this.start();
            a.d1(b);
        }
        public void run(){
            b.d2(a);
        }

    public static void main(String[] args) {
        Main d= new Main ();
        d.m1();
    }
}