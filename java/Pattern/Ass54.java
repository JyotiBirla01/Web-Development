public class Ass54 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) { // spaces
                System.out.print("  ");
            }

            for (k = 1; k <= 6 - i; k++) {
                if (i == 3 && k == 2)
                    System.out.print("_");
                else if (i == 2 && (k == 2 || k == 3))
                    System.out.print("_");
                else
                    System.out.print((char) (k + 64) + " ");
            }
            System.out.println();
        }
    }
}
