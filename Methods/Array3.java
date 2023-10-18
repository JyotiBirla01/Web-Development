public class Array3 {
    public void reverse(int n, int arr[]) {

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1];
            arr[n - 1] = temp;

        }
        System.out.println("After reversing array ");
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        Array3 obj = new Array3();
        obj.reverse(n, arr);

    }

}
