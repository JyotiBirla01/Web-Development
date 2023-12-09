
import java.util.Scanner;
public class Validation {
     public static boolean isvalid(String name){
    return name.matches("[a-zA-z]");
}
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    String  name= sc.nextLine();
    String number=sc.next();
 Validation.isvalid(name);  
 System.out.println(number.matches("\\d{10}"));


}
}