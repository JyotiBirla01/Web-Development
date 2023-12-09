
/*Q.22) C program to find nearest lesser and greater element in array
Given an array of N elements and we have to find nearest lesser and nearest greater element using C program.
Example:
    Input:
    Enter the number of elements for the arrray : 3  
 
    Enter the elements for array_1.. 
    array_1[0] : 1   
    array_1[1] : 2   
    array_1[2] : 3   
 
    Enter the number : 2 
 
    Output:
    Element lesser than 2 is : 1 
    Element greater than 2 is : 3
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ass22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements for the array: ");
        int n = scanner.nextInt();

        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Enter the elements for the array...");
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] : ");
            array.add(scanner.nextInt());
        }

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        int nearestGreater = Integer.MAX_VALUE;
        int nearestLesser = Integer.MIN_VALUE;

        for (int element : array) {
            if (element < num && element > nearestLesser) {
                nearestLesser = element;
            }
            if (element > num && element < nearestGreater) {
                nearestGreater = element;
            }
        }

        if (nearestLesser != Integer.MIN_VALUE) {
            System.out.println("Element lesser than " + num + " is: " + nearestLesser);
        } else {
            System.out.println("No element is lesser than " + num + " in the array.");
        }

        if (nearestGreater != Integer.MAX_VALUE) {
            System.out.println("Element greater than " + num + " is: " + nearestGreater);
        } else {
            System.out.println("No element is greater than " + num + " in the array.");
        }

        
    }
}
