public class Maximum {
    public static void main(String[] args) {
        int max = 0;
        int arr[] = { 1, 5, 7, 6, 4, 9 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

        }
        System.out.println(max);

    }

}
