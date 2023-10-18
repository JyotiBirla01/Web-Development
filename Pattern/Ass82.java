public class Ass82 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (i == 2 && k == 2)
                    System.out.print("_");
                else if (i == 3 && (k == 2 || k == 3 || k == 4))
                    System.out.print("_");
                else if (i == 4 && (k == 2 || k == 3 || k == 4 || k == 5 || k == 6))
                    System.out.print("_");
                else
                    System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = i - 1; j <= 3; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (i == 3 && (k == 2 || k == 3 || k == 4))
                    System.out.print("_");
                else if (i == 2 && k == 2)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

}
