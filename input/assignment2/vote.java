import java.util.Scanner;
package input.assignment2;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Elligible for vote");
        }
        else{
            System.out.println("Not elligible for vote ");
        }
    }
    
}
