
//Q.11 There are two arrays object one containing 100 elements and another 
//containing 50 elements. Both are of same data type. Can we assign one Array to 
//another Array.
import java.util.Scanner;

class Ass11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[100];
        int arr2[] = new int[50];
        arr1 = arr2;
        System.out.println(arr1.length);

    }
}