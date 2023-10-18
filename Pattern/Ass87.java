public class Ass87 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int j = 1; j <= 5; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }

            for (int l = 1; l <= 2 * (5 - j); l++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
