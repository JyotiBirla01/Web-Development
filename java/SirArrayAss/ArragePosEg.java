public class ArragePosEg {
    public static void main(String[] args) {
        int a[] = { 9, 4, 5, 0, 2, -2, -1, -5, -3 };
        int n = a.length - 1;
        while (a[n] < 0) {
            n--;

        }
        n += 1;
        System.out.println(n);
        int k = 1, temp = 0;

        while (k < a.length - 1 && n <= a.length - 1) {
            temp = a[n];
            for (int i = n; i > k; i--) {
                a[i] = a[i - 1];
            }
            a[k] = temp;
            k += 2;
            n++;
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}