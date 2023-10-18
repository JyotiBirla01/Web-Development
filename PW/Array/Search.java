//Search the given element x in the arrray .If present then return the index else return -1.

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int s = sc.nextInt();
        int i;
        int arr[] = new int[s];
        System.out.println("Enter the elements in array ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be serached ");
        int x = sc.nextInt();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Index of x is  " + i);
                break;
            } else {
                System.out.println(-1);
                break;
            }
        }

    }

}
