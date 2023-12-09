
//Find the last Occurence of an element x in a given array 
import java.util.Scanner;

public class LastOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the element which you want to count  ");
        int x = sc.nextInt();
        System.out.println("The last Index  of  element is ");
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                lastIndex = i;

        }
        System.out.println(lastIndex);

    }

}
