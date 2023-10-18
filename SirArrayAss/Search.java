import java.util.Scanner;

class Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the element which you want to search  ");
        int s = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s)
                System.out.println("The number found at index :- " + i);
        }

    }
}