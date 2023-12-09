// interface I1 {
//     class A {
//         void m1() {
//             System.out.println("Hello");
//         }
//     }

//     public static void main(String[] args) {
//         A obj = new A();
//         obj.m1();
//     }
// }
interface A {	
 void m1(int x, double y);	
}
abstract class B implements A {
public void m1(double x, int y){
  System.out.println("One");	 
 }
}
 class Test extends B {
public void m1(double x, int y){
 System.out.println("Two");
 super.m1(20.5, 20);
}
public void m1(int x, double y){
	System.out.println("Three");
}
public static void main(String[] args){
 Test t = new Test();
 t.m1(20.5, 10);
 t.m1(10, 5.5);
 }
}