
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size  of array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements in array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();

            }
            System.out.println(" Array is ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("please enter only integer value ");

        }

        catch (NegativeArraySizeException n) {
            System.out.println("Size cannot be negative");
        } 
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(" plz enter  elements only in the size of array");

        }
        System.out.println(" At the end ...");

    }

}
