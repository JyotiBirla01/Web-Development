public class Ass74 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (i == 4 && (k == 2 || k == 3 || k == 4 || k == 5 || k == 6))
                    System.out.print(" ");
                else if (i == 3 && (k == 2 || k == 3 || k == 4))
                    System.out.print(" ");
                else if (i == 4 && k == 2)
                    System.out.print(" ");
                else
                    System.out.print(k);
            }
            System.out.println();
        }
    }

}
