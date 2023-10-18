
/*Q.15 Write a Java program to print the following grid.
Expected Output :
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - - 
- - - - - - - - - -  */
import java.util.Scanner;

public class Ass15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = new char[8];
        System.out.println("Enter  Minus sign ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("The data you entered");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i]);
            }
            System.out.println();

        }

    }

}
