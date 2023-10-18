
// 29. Suppose a one-dimensional array AR containing integers is arranged in ascending order. 
// Write a java program to search for an integer from AR with the help of Binary search method, 
import java.util.Scanner;;

public class Array29 {
    public String binarySearch(int n, int element, int arr[]) {
        int low = 0, high = n - 1, mid;
        boolean flag = false;
        while (low <= high) {
            mid = low + high / 2;
            if (element == arr[mid]) {
                flag = true;
                break;

            }
            if (element > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        if (flag)
            return "Element found ";
        else
            return "Element not found ";
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int element = sc.nextInt();
        Array29 obj = new Array29();
        String result = obj.binarySearch(n, element, arr);
        System.out.println(result);

    }

}
