public class Length {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 1, 2, 5 }, { 3, 4, 5 } };
        System.out.println(a.length);
        for (int i = 0; i < (a.length); i++) {
            for (int j = 0; j < (a.length); j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }

    }

}
