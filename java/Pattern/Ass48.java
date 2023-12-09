public class Ass48 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                if (i == 3 && (k == 2 || k == 5))
                    System.out.print("_");
                else if (i == 4 && (k == 2 || k == 3))
                    System.out.print("_");
                else
                    System.out.print((char) (k + 64));
            }
            System.out.println();
        }
    }

}
