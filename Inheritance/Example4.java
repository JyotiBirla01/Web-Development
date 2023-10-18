 class A {
    public A(){
        System.out.println("Default A");
    }
    
}
class B extends A{
    public B(){
        System.out.println("B Default ");
    }
}
class C extends B{
    public C(){
        System.out.println("C default ");
    }
}
class Main{
    public static void main(String[] args) {
        new C();
    }
}