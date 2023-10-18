public class ReverseArray {
    public void reverse(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[6 - 1 - i];
            arr[6 - 1 - i] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

class Main {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        ReverseArray obj = new ReverseArray();
        obj.reverse(arr);

    }
}
