 class A {
public A(){
    this(10);
    System.out.println("A default");
    
}
    public A(int x){
        System.out.println("A parameterized");
    }
}
 class B extends A{
public B(){
  //super(); 
    System.out.println("B default");
}
 public static void main(String[] args) {
  //ew A(100);
    new B();

 }
}
