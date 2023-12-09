public class Searchele {
    public static void main(String[] args) {
        int ans = -1;
        int a[] = { 1, 4, 5, 7, 6, 8 };
        int x = 5;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                ans = i;

        }
        System.out.println("Found " + x + " at index " + ans);
    }

}
