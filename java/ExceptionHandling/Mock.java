public class Mock {
    public void m1(Object o){
System.out.println("A");
    }
}
class B extends Mock{
    public void m1(String s){
System.out.println("B");
    }
}
class Main{
    public static void main(String[] args) {
        Mock obj= new B();
        obj.m1(" hello");
    }
}