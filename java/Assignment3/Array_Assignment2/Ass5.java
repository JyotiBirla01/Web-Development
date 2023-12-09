
//Q.5 Write a Java program to test two arrays' equality.
import java.util.Scanner;

public class Ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int s1 = sc.nextInt();
        System.out.println("Enter the size of array2");
        int s2 = sc.nextInt();
        int arr1[] = new int[s1];
        int arr2[] = new int[s2];
        System.out.println("Enter the elemnts in array1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elemnts in array2");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    c++;
                }
            }

        }
        // System.out.println(c);
        if (c == s1)
            System.out.println("Arrays are equal");
        else
            System.out.println("Arrays are not equal");

    }

}
