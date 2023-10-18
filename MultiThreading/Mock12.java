class P{
    int  b= 5;
    public void setA(int b){
      this.b=b;
    }
}
final class A extends P{
   final private int a;
    public A(int a){
       this.a=a;
    }
     public void m1(){
      System.out.println(a); 
     }
    public void setA(int b){

   }
   
   }
   class Exam{

    public static void main(String args[]) {
    //  A ob=new A(2);
      System.out.println("ddd");
     // ob.m1();
 }
}