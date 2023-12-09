 class SingleTonExample {
    private static SingleTonExample s= new SingleTonExample();
    private SingleTonExample(){

    }
    public static SingleTonExample getSingleTonExample(){
        return s;
    }
public void m1(){
    System.out.println("Hello");
}
public static void main(String[] args) {
   SingleTonExample s2 =new SingleTonExample();
   s2.m1();
   SingleTonExample s3 =new SingleTonExample();
   s3.m1();
   s.m1();
}
}
// public class SingleTon {

//     // Private static instance variable
//     private static SingleTon instance;

//     // Private constructor to prevent external instantiation
//     private SingleTon() {
//         // Initialization code, if any
//     }

//     // Public static method to provide access to the instance
//     public static SingleTon getInstance() {
//         // Create the instance if it doesn't exist
//         if (instance == null) {
//             instance = new SingleTon();
//         }
//         return instance;
//     }

//     // Other methods and fields of the class
//     public void doSomething() {
//         System.out.println("SingleTon is doing something.");
//     }

//     public static void main(String[] args) {
//         // Get the SingleTon instance
//         SingleTon singleTon = SingleTon.getInstance();

//         // Call methods on the SingleTon
//         singleTon.doSomething();
//     }
// }
