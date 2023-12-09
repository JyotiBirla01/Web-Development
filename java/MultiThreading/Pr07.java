//Overloading of run method 
class Test extends Thread {
    public int run(int i) {
        return i;
    }
}

public class Pr07 {
    public static void main(String[] args) {
        Test t= new Test();
        System.out.println(t.run(89));
        
        t.start();
    }

}
