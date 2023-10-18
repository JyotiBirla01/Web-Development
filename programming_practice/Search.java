import java.util.Scanner;

class Search {
    boolean flag = true;

    public void searchElement(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                flag = false;
                System.out.println("The element is found ");
            }
        }
        if (flag == true)
            System.out.println("The element is not found");

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element ");
        int element = sc.nextInt();
        Search obj = new Search();
        obj.searchElement(arr, element);
    }
}