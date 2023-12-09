public class Multi {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 5 }, { 4, 5, 6, 4 }, { 1, 7, 8, 1 }, { 1, 3, 4, 3 } };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(" " + a[i][j]);

            }
            System.out.println();

        }
    }

}
