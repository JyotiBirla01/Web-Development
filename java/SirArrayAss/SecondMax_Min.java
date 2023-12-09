import java.util.Scanner;

public class SecondMax_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int max1 = 0, min1 = arr[0], max2 = 0, min2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1)
                max1 = arr[i];
            if (arr[i] < min1)
                min1 = arr[i];

        }
      //  System.out.println("Maximum value is " + max1);
        //System.out.println("Minimum value is " + min1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max1 && arr[i] > max2)
                max2 = arr[i];
            if (arr[i] > min1 && arr[i] < min2)
                min2 = arr[i];
        }
        System.out.println("Maximum value is " + max2);
        System.out.println("Minimum value is " + min2);

    }

}
