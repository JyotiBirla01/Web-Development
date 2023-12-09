interface I1{
public default void m1(){
System.out.println("I1");
}
}
interface I2{
public default void m1(){
System.out.println("I1");
}
 
}
class Main implements I1,I2{
    public  void m2(int a){
System.out.println("I1");
}
    
}
class TestMain{
    public static void main(String[] args) {
        
    }
}