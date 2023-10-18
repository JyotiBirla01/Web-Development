// interface A {
//     void m1();

//     default void m2() {
//         System.out.println("Hello ");
//     }
// }

// class C implements A {
//     public void m1() {
//         System.out.println(" hello ");
//     }

//     public void m2() {
//         System.out.println(" By----------- ");
//     }

//     public static void main(String[] args) {
//         A obj = new C();
//         obj.m1();
//         obj.m2();
//     }
// }
interface A {
   default void m1(){

   }

}

interface B {
   default void m1(){

   }

}

class C implements A, B {
    public void m1() {
        System.out.println(" M1");

    }

    // public void m2() {
    //     System.out.println(" m2 ");
    // }
     public static void main(String[] args) {
      A oj= new C();
      oj .m1();  
     }
}
// interface A {
//     default void m2(){
//         m1();
//     }
//     private void m1() {
//         System.out.println(" m1");
//     }
// }

// class B implements A {
//     public static void main(String[] args) {
//         A obj = new B();
//        obj.m2();
//     }
// }
//public interface A {
// default void m1(){
//     System.out.println(" Hello ");
// }
// }

// abstract interface B {
//     default void m1(){
//         System.out.println(" hi ");
//     }

// }

// interface C extends A, B {
//   default void m1(){
//     System.out.println(" c ");
// }

//}
// class Main implements A,B{
//      public void m1(){
//         System.out.println(" main");
//      }
//     public static void main(String[] args) {
//         A obj = new Main();
//          obj.m1();
//     }
// }
// interface A {
//     static void m1() {
//         System.out.println(" hello ");
//     }
// }
// class Main implements A{
//  static void m1() {
//         System.out.println(" main ---------");
//     }    public static void main(String[] args) {
//        // Main obj= new Main()
//        Main.m1();
//     }
// }
// class A{
//      public  static void m1(){
//         System.out.println(" m1  parent ");
//      }
// }
// class B extends A{
//  public  static void m1(){
//         System.out.println(" m1  child  ");
//      }
//      public static void main(String[] args) {
//      //   B.m1();
//         A obj= new B();
//         obj.m1();
//      }
// }
// class  A{
//      public  void m1(){

//      }
//        // System.out.println("m1 ");

// }
// class B{
//     public static void main(String[] args) {
//         A obj= new A() {
//             public void m1(){
//                 System.out.println(" m1 annoi ");
//             }
//         };
//         obj.m1();
//     }
// }
// class A {

// }

// interface B extends A {

// }
interface A {
    void m1();
    default void m2(){
        System.out.println( " default" );
    }

}

class B  {

    // public void m1() {
    //     System.out.println(" hello ");
    // }

    public static void main(String[] args) {
        // B obj = new B();
        // obj.m1();
        // obj.m2();
        A obj = ()->System.out.println("  helllo ");
        obj.m1();
        obj.m2();
    }
}