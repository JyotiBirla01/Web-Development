import java.util.Scanner;

public class Sort0s1s2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int i = 0, count1 = 0, count2 = 0, count3 = 0;
        while (i < n) {
            if (arr[i] == 0)
                count1++;
            if (arr[i] == 1)
                count2++;
            if (arr[i] == 2)
                count3++;
            i++;
        }
        i = 0;
        while (count1 > 0) {
            arr[i++] = 0;
            count1--;

        }
        while (count2 > 0) {
            arr[i++] = 1;
            count2--;

        }
        while (count3 > 0) {
            arr[i++] = 2;
            count3--;

        }
        System.out.println("After sorting 0s , 1s and 2s ");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

}
