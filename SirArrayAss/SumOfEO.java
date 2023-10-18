import java.util.Scanner;

class SumOfEO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumeven = 0, sumodd = 0;
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                sumeven = sumeven + arr[i];
            else
                sumodd = sumodd + arr[i];

        }
        System.out.println("Sum of array is :- " + sumeven);

        System.out.println("Sum of array is :- " + sumodd);

    }
}