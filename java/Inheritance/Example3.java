 class A {
    public A(int x){
        System.out.println("A para ");
        System.out.println(x);
    }
    
}
class B extends A{
    public B(){
        super(30);
        System.out.println("Default B");

    }
    public B(int x){
super(40);
        System.out.println("Para");
        System.out.println(x);
    }
    public static void main(String[] args) {
        new B();
      //  new B(100);
    }
}
