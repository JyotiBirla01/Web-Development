
 class A {
    A(){
System.out.println("De");
    }
    A(int x){
        System.out.println("Para");
    }
}
class B extends A{
    B(){
        System.out.println("De B");
    }
    B(int y){
        System.out.println("Para BB");
    }
}
class Main{
    public static void main(String[] args) {
        B obj= new B();
        new B(10);
    }
}