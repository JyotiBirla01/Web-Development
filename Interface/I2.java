class A{
    class B{
        void m1(){
            System.out.println("m1 called ");
            m2();
        }
        void m2(){
            System.out.println("m2 called");
            
        }
    }
}
class Main{
    public static void main(String[] args) {
        A outer= new A();
        A.B inner=outer.new B();
        inner.m1();
        
    }
}