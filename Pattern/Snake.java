public class Snake {
    public static void main(String[] args) {
        int a = 1, b = 11, c = 12, d = 18, e = 19, f = 21;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(a + " ");
                    a++;
                }
                if (j == 2) {
                    System.out.print(b + " ");
                    b--;
                }
                if (j == 3) {
                    System.out.print(c + " ");
                    c++;
                }
                if (j == 4) {
                    System.out.print(d + " ");
                    d--;
                }
                if (j == 5) {
                    System.out.print(e + " ");
                    e++;
                }
                if (j == 6) {
                    System.out.print(f + " ");
                    f++;
                }

            }
            System.out.println();

        }
    }

}
