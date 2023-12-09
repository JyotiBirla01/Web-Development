abstract class Test11 {
    abstract void m1();
}
abstract class Test12{
    abstract void m1();

}
class Test13 extends Test11,Test12{
    public static void main(String args[]){
        Test13 obj= new Test13();
        obj.m1();
    }
}