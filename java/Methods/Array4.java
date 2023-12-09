//Q.4 Write a program to sort the array
public class Array4 {
    public void sort(int n, int arr[]) {
        System.out.println("After sorting array ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 7, 2, 0, 1, 5, 19 };
        int n = arr.length;
        Array4 obj = new Array4();
        obj.sort(n, arr);

    }

}
