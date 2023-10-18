interface I1{
public default  void m1(){
System.out.println("M1");

}
interface I2{
    public default void m1(){
    System.out.println("M1");
    }
}
}
class A implements I1,I2{
    public   void m1(){
    System.out.println("M1");
    }
}
class Main{
    public static void main(String[] args) {
        A obj= new A();
        obj.m1();
    }
}