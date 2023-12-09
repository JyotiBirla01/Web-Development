import java.util.Scanner;

public class Pr2 {
    public static void  max_min(int arr[], int n) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
       // boolean flag = false, flag1 = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
               
            }

            if (arr[i] < min) {
                min = arr[i];
               
            }
        }
        System.out.println("Max element is "+max);
         System.out.println("Min element is "+min);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       
        max_min(arr, n);
        
    }
}
